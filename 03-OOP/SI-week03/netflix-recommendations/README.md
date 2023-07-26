# netflix-recommendations

Your former study buddy works for Netflix and asked you to help out with some features. They want to provide better
recommendations for their users, along with new search options. The new feature set includes the following.

* A list of the top n movies or shows with the highest IMDB scores from their dataset.
* Searching for the cast by movie or show title.
* Getting the top n movies or shows for a given genre.
* Getting all movies or shows in which a given actor or director is featured.
* A new recommendation engine.

The recommendation engine needs to calculate recommendations for users based on movie or show titles from their dataset.
A recommendation must be calculated by different rules, using a point-buy system of similarity scores.

* The title given by the user must be compared one by one to every title in titles.csv.
* A title can get +10 points if the type (MOVIE/SHOW) matches with another one.
* A title can get +20 points if the compared title matches in genre.
* A title can get +15 points for each actor who plays in both titles.
* A title can get +30 points for a similar director.
* The IMDB score, rounded, must be added to the final value of similarity score.
* These points need to be summed, and every title must get a similarity score compared to the original title.

What are you going to learn?

* Use stream operations.

## Tasks

### Get the Top Movies

Get the top n movies with the best IMDB score.

* The getTopNImdbScoreFromTitles method in TitleManager returns a list of the n best scoring titles. No loops or if
  statements are used.

### Get the cast for a title

Get all cast (aka the credits) for a title of a movie or show available in titles.csv. The method receives all necessary
titles as parameters.

* The getAllCreditsForTitle method in TitleManager returns every cast member available in credits.csv. No loops or if
  statements are used

### Get the top n movies for a given genre

Get movies of the top n IMDB scores in a given genre.

* The getTopNImdbScoreFromGivenGenre method in TitleManager returns movies of the top n IMDB scores in the given genre
  from titles.csv. The n number is the length of the list, which the user provides. No loops or if statements are used.

### Get all titles for credit

Get all movies or show titles for an actor or director in credits.csv. The method receive all necessary credits as
parameters.

* The getAllTitlesByCreditName method in CreditManager returns actors or directors from titles.csv. No loops or if
  statements are used.

### Calculate recommendations of movies/shows based on a title

Calculate recommendations for a user based on movie or show titles (the title must be already in titles.csv). Compare
the title given by the user one by one to every title in titles.csv. Calculate a recommendation by different rules,
using a point-buy system detailed in the description. List the titles with the n highest similarity scores.

* The getCastForTitle in SimilarityScoreCalculator class returns the credits (that is, the cast) of a given title. No
  loops or if statements are used.
* The getSimilarityScoreBasedOnType method in SimilarityScoreCalculator class returns the point for the same type, if
  the two types (movie or show) match, or zero, if not. No loops or if statements are used.
* The getSimilarityScoreBasedOnGenre method in SimilarityScoreCalculator class counts the number of matching genres from
  two lists of genres. The method returns the point for the similar genre multiplied by the count of matching genres. No
  loops or if statements are used.
* The getCreditsByRole method in SimilarityScoreCalculator class returns a list of names that match the role (that is,
  the names of every actor or director) from the list of credits defined in a parameter. No loops or if statements are
  used.
* The getSimilarityScoreBasedOnActors method in the SimilarityScoreCalculator class counts the number of matching actors
  from the lists provided as parameters. The method returns the point for similar actors multiplied by the count of
  matching actors. No loops or if statements are used.
* The getSimilarityScoreBasedOnDirectors method in the SimilarityScoreCalculator class counts the number of matching
  directors from the lists provided as parameters. The method returns the point for similar directors multiplied by the
  count of matching directors. No loops or if statements are used.
* The getPointsForImdbScore method in the SimilarityScoreCalculator class returns the rounded IMDB score of a title. No
  loops or if statements are used.
* The calculateSimilarityScore method in the SimilarityScoreCalculator class returns the similarity score calculated for
  a title compared to the user's title of interest No loops or if statements are used.

### Use the calculated recommendations

The getSimilarMoviesByTitle method in the TitleManager class returns the n titles of the highest similarity score.

* The getSimilarMoviesByTitle in TitleManager class returns the n titles of the highest similarity score.
* The method takes a titleName as its first parameter. The input is handled in a case-insensitive manner.
* If the 'getSimilarMoviesByTitle' method cannot find the title provided by the user, it throws a NoSuchElementException
  with the text Title with name: <title name> not found!
* The method collects every title from titles.csv, creates a TitleWithSimilarityScore object from them, sorts the titles
  by their similarity score, and returns the n highest scoring titles.

### Hints

* The data is not always that clean you expect. Look out for exceptions.

### Background materials

[Java Streams](../../JavaStreams.md)  
[Map method on streams](../../JavaStreamsMap.md)  
[Filter method on streams](../../JavaStreamsFilter.md)  
[Sorting streams](https://stackabuse.com/java-8-how-to-sort-list-with-stream-sorted/)  
[Sorting in Java in general](https://www.baeldung.com/java-sorting)  
[Lambda expressions in Java](../../JavaLambdaExpressions.md)  
[Optional in Java](../../JavaOptionalClass.md)  
