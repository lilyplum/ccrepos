## Daily output calculation

The output of a solar panel is determined by various factors: besides the technology used in the panel, its area, its location, its orientation towards the sun, the time of year, the temperature, and many other weather conditions matter a lot. Here we make the following simplifications:

1. At any given latitude and time of year we can calculate the total amount of solar radiation energy falling at a square meter per day, assuming that the surface is always set perpendicular to the incoming sun rays. The `SunManager` class provides these calculations, using approximations and equations typically used in this field. The `getDailyInsolation()` method returns this calculated daily energy in `kWh/m2` based on the latitude and the date. You don't need to touch these calculations, just use the results.

2. The theoretical maximum output needs to be modified if the panel is set to a fixed position during the day. Panels in solar arrays are usually tilted towards the Equator (on the Northern hemisphere towards south) at a specific angle. The close-to-optimal daily panel setting is perpendicular to the sun at noon, which is also provided by `sunManager` for any given latitude and date. In other words, the optimal setting is when `panelAngle + sunMaxElevationAngle` equals to `90°`, and the correction factor for different panel angles is the sine (remember trigonometry?) of this sum.

3. The energy output is proportional to the area exposed to the sun.

4. The effect of every other systematic factor (not counting weather conditions) is compressed into a panel efficiency rate that is determined by the type of the solar panel. We'll use three panel types in this project with typical efficiency rates.

We will use these approximations to calculate the maximum daily energy output (excluding weather effects like cloudy hours, snow, etc): `dailyInsulation × sin(panelAngle + sunMaxElevationAngle) * panelArea * panelEfficiency`. This provides a good enough base value for a fixed solar panel's daily energy production in `kWh`.

Needless to say that reality is much more complicated than that, but this will do the job as a first approximation towards a full-fledged solar plant simulator.

## Yearly output calculations

Fixed panels lose some fraction of the possible maximum energy. We'd get the maximum out of our solar plant if we adjusted the panels always to the daily optimal angle (`90° - sunMaxElevationAngle`). This would require complex mechanical equipments, and it's nearly impossible to achieve it manually.

In practice, we do one of the following:

1. Set our panels to an optimal angle to get the best possible performance for the whole year. The optimal angle depends only on the latitude. We included the empirical formula in `SolarArrayManager`.

2. We adjust the panel angles manually few times a year. When adjusted, we set the angles to the optimal value for the midday of the following period. For example, if you plan to change angles quarterly, follow these lines:
   - On 1 Jan, set the panels to the optimal daily setting for 15 Feb (fixed between Jan and March).
   - On 1 Apr, set the panels to the optimal daily setting for 15 May (fixed between Apr and Jun).
   - On 1 Jul, set the panels to the optimal daily setting for 15 Aug (fixed between Jul and Sep).
   - On 1 Oct, set the panels to the optimal daily setting for 15 Nov (fixed between Oct and Dec).

## Problem checking

Engineers do routine checks on panels regularly. First of all, there is a period of time in operation after which a check is recommended. This period is specific to panel types, and a solar array management system needs to record every supervision, and warn the operators to check up a panel if the last occasion was too long ago.

For the sake of quicker problem discovery, there is another monitoring system in use. The actual power output is constantly recorded for each panel, and it is a warning sign if the output of a specific panel is significantly lower than the similar panels in the nearby. Only the surrounding panels are relevant here to screen out larger scale weather effects.

For this, we need a warning system that compares a panel's power output to the average of its surroundings. For this average we usually take 1, 2, or 3 "layers" around the one under investigation, and naturally only the same types.

Let's have an example on this solar array, checking on panel `402`:

```
101  102  103  104  105  106  107  108
201  202  203  204  205  206  207  208
301  302  303  304  305  306  307  308
401  402  403  404  405  406  407  408
501  502  503  504  505  506  507  508
701  702  703  704  705  706  707  708
801  802  803  804  805  806  807  808
```
Setting the distance to `2` means that we need to select the first two "layers" around `402`:
1. ```
   301  302  303
   401   x   403
   501  502  503
   ```
2. ```
   201  202  203  204
                  304
         x        404
                  504
   601  602  603  604
   ```

Setting the distance to `2` means that we need to select from these panels the ones that are of the same type as  panel `402`, take their average power output as `AVG`. We need to warn the operators if the output of `402` is lower than `AVG × k` where `k` is a given threshold. In the special case when there are no similar panels in the surrounding layers, no warning should be raised.


##  Resources

- <https://solarpaneltilt.com/>
- <https://www.pveducation.org/>
- <https://brian-rose.github.io/ClimateLaboratoryBook/courseware/insolation.html>
