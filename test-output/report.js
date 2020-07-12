$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("product.feature");
formatter.feature({
  "line": 1,
  "name": "Products",
  "description": "",
  "id": "products",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Products check",
  "description": "",
  "id": "products;products-check",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "user visit https://checkout.pod-point.com/",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user select Mitsubishi and Outlander in the Select Your Car fields",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "user check the box ‘I am NOT eligible to claim the dealership discount as I did not come through a dedicated dealership’",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user select the ‘Universal Socket’ option",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user select power rating",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user check the prices for the 7kw unit displayed match the following values £879 Full Price and £529 With OLEV Grant",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user check that 6 compatible extras are shown",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "user select a random compatible extra",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "the total price at the bottom right of the screen should correctly match the 7kw unit price + the compatible extra price",
  "keyword": "Then "
});
formatter.match({
  "location": "productStep.user_visit_https_checkout_pod_point_com()"
});
formatter.result({
  "duration": 6916857029,
  "status": "passed"
});
formatter.match({
  "location": "productStep.user_select_mitsubishi_and_outlander_in_the_select_your_car_fields()"
});
formatter.result({
  "duration": 1492243499,
  "status": "passed"
});
formatter.match({
  "location": "productStep.user_check_the_box_i_am_not_eligible_to_claim_the_dealership_discount_as_i_did_not_come_through_a_dedicated_dealership()"
});
formatter.result({
  "duration": 1819879755,
  "status": "passed"
});
formatter.match({
  "location": "productStep.user_select_the_universal_socket_option()"
});
formatter.result({
  "duration": 1988882444,
  "status": "passed"
});
formatter.match({
  "location": "productStep.user_select_power_rating()"
});
formatter.result({
  "duration": 2013878686,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "7",
      "offset": 30
    },
    {
      "val": "879",
      "offset": 77
    },
    {
      "val": "529",
      "offset": 97
    }
  ],
  "location": "productStep.user_check_the_prices_for_the_kw_unit_displayed_match_the_following_values_£_Full_Price_and_£_With_OLEV_Grant(int,int,int)"
});
formatter.result({
  "duration": 81205863,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "6",
      "offset": 16
    }
  ],
  "location": "productStep.user_check_that_compatible_extras_are_shown(int)"
});
formatter.result({
  "duration": 7297671463,
  "status": "passed"
});
formatter.match({
  "location": "productStep.user_select_a_random_compatible_extra()"
});
formatter.result({
  "duration": 284740893,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "7",
      "offset": 77
    }
  ],
  "location": "productStep.the_total_price_at_the_bottom_right_of_the_screen_should_correctly_match_the_kw_unit_price_the_compatible_extra_price(int)"
});
formatter.result({
  "duration": 120093,
  "status": "passed"
});
});