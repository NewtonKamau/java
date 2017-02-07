// public class GroceryList {
//           public static void main(String[] args) {
//             String[] myGroceryList = { "ice cream", "hot sauce", "pickles", "bananas", "cereal", "rice", "yogurt"  };

//             for ( String groceryItem : myGroceryList ) {
//               System.out.println( groceryItem );
//             }
//           }
//         }
        
        // using looping through integers
        // public class GroceryList {
        //   public static void main(String[] args) {
        //     String[] myGroceryList = { "ice cream", "hot sauce", "pickles", "bananas", "cereal", "rice", "yogurt"  };
        //     Integer[] groceryItemPrices = { 3, 6, 4, 2, 4, 4 };

        //     for ( String groceryItem : myGroceryList ) {
        //       System.out.println( groceryItem );
        //     }
        //   }

// adding a for each loop and showing the price to the user
// public class GroceryList {
//           public static void main(String[] args) {
//             String[] myGroceryList = { "ice cream", "hot sauce", "pickles", "bananas", "cereal", "rice", "yogurt"  };
//             Integer[] groceryItemPrices = { 3, 6, 4, 2, 4, 4 };

//             for ( String groceryItem : myGroceryList ) {
//               System.out.println( groceryItem );
//             }

//             Integer total = 0;
//             for ( Integer price : groceryItemPrices) {
//               total = total + price;
//             }

//             System.out.println("Your total for this shopping trip will be: $" + total);
//           }
//         }
// using a for loop , look at index

        public class GroceryList {
          public static void main(String[] args) {
            String[] myGroceryList = { "eggs", "milk", "bread", "bananas", "cereal", "rice" };

            for ( Integer index = 0 ; index < myGroceryList.length ; index++ ) {
              System.out.println( myGroceryList[index] );
            }
          }
        }
