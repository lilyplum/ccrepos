<!-- ASPCA advocates rallied to improve farm animal welfare, submitting over 27,000 <br></br>
          comments to the USDA in support of a strong organic animal-welfare rule. The rule <br></br>
          offers a much-needed chance to improve the lives of more than 186 million farm animals <br></br> 
          raised under the USDA Organic program each year.  -->

# LEGACY: React for a cause
```
This is a legacy project, kept here as an archive. If you didn't started it, you shouldn't do it.
```
It's always a great thing to help others. Maybe you're already helping out in a dog shelter, handing out food for people in need, collecting used clothes for charities or lowering your plastic usage, separate garbage to keep our planet clean.

In fact, there are many NGOs (non-governmental organizations) specialized for great causes. In this project, you'll have the chance to help one of them.

Choose a preferably worldwide organization who you'd like to help with a new website. Some of them already have great sites, this time, try to find one who lacks a site or has one, but an old, not so useful one. They may work in any area.

What are you going to learn?
* Create a one page website in React
* React JSX, components, props

## Tasks

### Choose an NGO
Choose an international NGO, which could use a better website and replan their page in a way that clearly explains their cause and the working of their organization and convince the visitor that the NGO is legit and trustworthy and it is worth supporting.

* There is a clear topic for whom the website was created
* There is an introduction of the NGO in the projects README.md file at the top

### HTML/JSX structure
Like any real-life project, an NGOs website should be also planned well. For that create the structure which contains at least a Landing/Welcome section with a Call to action button (e.g.: Learn more or Donate), an About section, a section where the Landing section's CTA button leads, and a Contact section with a contact form.

* The cause and the workings of the NGO are represented in the content
* There is a Landing/Welcome section on the page with a Call to action button
* There is a section where the Landing section's CTA button leads
* There an About section on the page
* There is a Contact section on the page
* All the sections on the page are in different components


### Prepare for the sitebuild
Before you start to build the website select a good font pairing from Google fonts and nice color palette.

* Two font families selected from Google fonts for the project
* At least two colors were selected for the project

### Create sitebuild
Create the sitebuild based around the JSX structure with the previously selected fonts and colors. Take care of the paddings and the margins. If a text is stuck to the edge of a block it could ruin the User Experience. Also, don't forgot to make the site responsive.

* The JSX/component structure got a visuality with the previously selected fonts and colors with CSS
* The layout of the page is responsive (looks well in all device sizes from mobile to desktop).

### Contact form
Clicking on the contact form's send button should imitates that the forms content was sent. So hide the form and add this text:
```
We appreciate you contacting us. One of our colleagues will get back in touch with you soon!
Have a great day!
```
Don't use any css or direct DOM manipulation for hiding the form and showing the text. Also, show the form's inputs values in one object in the console. Something like this:
```json
{
  "firstName": "Anna",
  "lastName": "Haywater",
  "email": "anna.haywater@nyco.com"
  "subject": "Job inquiry",
  "message": "I would like to receive information about pro bono job opportunities in you NGO."
}
```

* Clicking on the contact form's send button, the form disappears and the thank you text appears.
* Clicking on the contact form's send button, the form's inputs values are added to an object (as key value pairs) and the object (console) logged in the browser's console.
* Don't use any css or direct DOM manipulation for hiding the form and showing the text.

### General requirements

### Hints
* Use components! Even if this is a one page website you can separate into reusable components (e.g.: button component, section component etc.)
* Inspire! Take a look around the examples from Awwwards.com and OnePageLove.com
  * Unleash your creativity! You can be creative.
### Backkground materials
[Examples from awwwards.com](https://www.awwwards.com/websites/single-page/)  
[Examples from onepagelove.com](https://onepagelove.com/)  
[About Single Page or One page Websites](https://www.justinmind.com/blog/single-page-vs-multi-page-websites-design-battle/)  
[Five key elements of a Singe Page Website](https://torquemag.io/2018/05/one-page-website-elements/)  
[Coolors: color palette ideas](https://coolors.co/palettes/trending)  
[CSSCP: color palette ideas](https://palettes.shecodes.io/)  
[Color Hunt: color palette ideas](https://colorhunt.co/)
[Typewolf: Font pairing ideas](https://www.typewolf.com/)
[Typewolf: best Google Fonts](https://www.typewolf.com/google-fonts)
[Google font pairing ideas](https://www.pagecloud.com/blog/best-google-fonts-pairings)
