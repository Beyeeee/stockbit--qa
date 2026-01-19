1. TC-Login-001 

Scenario
verify user accounts can login

Pre condition
User is not login

Steps
1. User open MyDemoApp
2. User tap to login
3. User enter username bod@example.com
4. User enter password 10203040
5. User tap login button

Expected result
User is logged in successfully and redirected to the home page

2. TC-Product-001

Scenario
User see the product at Catalog page

Pre condition
User open MyDemoApp

Steps
1. User open MyDemoApp
2. Catalog page is displayed

Expected result
Display all products for sale

3. TC-Cart-001

Scenario
User add the product to the cart

Pre condition
User at the Catalog page

Steps
1. User select a product from the Catalog page
2. User choose the colors product
3. User set the quantity of the product
4. User tap Add to cart button

Expected result
Product add to the cart successfully

4. TC-Cart-002

Scenario
User is redirected to Product Detail page after choosing a product

Pre Condition
User at the Catalog page

steps:
1. User taps on "Sauce Lab Bike Light" product

Expected Result:
User is Redirected to Product Detail page

5. TC-Cart-003

Scenario
Product quantity in cart matches with selected quantity

Pre condition
User set the quantity to put at cart

steps
1. User taps on "Sauce Lab Bolt T-Shirt" 
2. User sets product quantity to 2
3. User tap "Add to cart" button

Expected Result
Product successfully added to cart with quantity 2

6. TC-Checkout-001

Scenario
User checkout the product from the cart

Pre condition
User is logged in and has at least one product in the cart

Steps 
1. User tap "Process To Checkout" button
2. User input the shipping address
3. User tap "To Payment" button
4. User input payment method
5. User tap "Review Order" button
6. User tap "Place Order" button

Expected result
Order is placed successfully and confirmation page is displayed 