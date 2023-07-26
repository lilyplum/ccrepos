# dynamic-image-processor

At Codabi Inc., you are in a team that is working on the company flagship product, Imageshop. This is a graphical image
editor desktop application. The team relies on user feedback and they saw a significant need for new functionality, such
as cropping, resizing, and enhancing color. You as a backend developer in the team get the task to develop image
processing algorithms for some of the new features.

Work on the project in the following iterations.

* In the first section, focus on resizing and greyscale.
* In the second section, focus on cropping and enhancing red color
* In the third section, focus on swapping red with blue and red with green.

When working on the tasks in a section, focus only on the features related to the given section. This helps you practice
the open–closed Principle.

What are you going to learn?

* Apply open–closed principle.
* Apply Liskov substitution principle.
* Use image processing library BufferedImage.

## Tasks

### Section 1 - Image resize

Enable determining a new size for the image using width and height as parameters.

* The Processor interface is implemented in the Resize class. The class can be used for resizing images by providing the
  new width and height as parameters.

### Section 1 - Grayscale

The highest voted features by the community are resizing and grayscale. Your team wants to satisfy users as soon as
possible. Enable creating a grayscale image from a source image.

* The Processor interface is implemented in the Grayscale class. The class can convert images to grayscale.

### Section 2 - Crop

Cropping is important to make sure the viewer can focus on interesting parts of the image. Enable determining a cropping
area, including the start and the size (width and height) of the crop area.

* The Processor interface is implemented in the Crop class. The class can crop images based on the starting point (x and
  y coordinates) and the width and height of the crop area.

### Section 2 - Enhance red

Sometimes image colors are a bit off because the lightning is not too great. The task is to make images a bit more
active by enhancing the Red color on the image with some value. Enable enhancing an image by boosting the red color by
20.

* The Processor interface is implemented in the RedEnhancer class. The class can enhance the red color on the picture by
  20

### Section 3 - Swap red and blue

User satisfaction is increasing with the previous features being released. To support color-blind people, concentrate on
the color swapping feature. Swapping color channels might be tricky. You only need to focus on simple cases. Swapping
red with blue and red with green. Enable swapping the red and blue color channels of an image.

* The RedBlueSwapper class is implemented. It can swap red colors with blue.

### Section 3 - Swap red and green

Enable swapping the red and green color channels of an image

* The RedGreenSwapper class is present, that can swap the red colors with green.

### Hints

* Simplify resizing images by creating Graphics2D and drawing the image.
* Use the getSubimage method of the BufferedImage for cropping.
* Modify colors (grayscale or enhancing red). by creating a new image. Then you can access the Color of the pixels of
  the original image and create a new Color for them.
* Define specific color swapper techniques to make color swapping future-proof.

### Background materials

[BufferedImage](https://docs.oracle.com/javase/tutorial/2d/images/index.html)  
[SOLID principles in pictures](https://medium.com/backticks-tildes/the-s-o-l-i-d-principles-in-pictures-b34ce2f1e898)  
[Open/Closed Principle in java](https://www.baeldung.com/java-open-closed-principle)  
[Liskov Substitution Principle in java](https://www.baeldung.com/java-liskov-substitution-principle)  
