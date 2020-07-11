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
  "name": "Title of your scenario",
  "description": "",
  "id": "products;title-of-your-scenario",
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
  "name": "user select a random compatible extra",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "the total price at the bottom right of the screen should correctly match the 7kw unit price + the compatible extra price",
  "keyword": "Then "
});
formatter.match({
  "location": "productStep.user_visit_https_checkout_pod_point_com()"
});
formatter.result({
  "duration": 4535270728,
  "status": "passed"
});
formatter.match({
  "location": "productStep.user_select_mitsubishi_and_outlander_in_the_select_your_car_fields()"
});
formatter.result({
  "duration": 1000301934,
  "status": "passed"
});
formatter.match({
  "location": "productStep.user_check_the_box_i_am_not_eligible_to_claim_the_dealership_discount_as_i_did_not_come_through_a_dedicated_dealership()"
});
formatter.result({
  "duration": 1389079973,
  "status": "passed"
});
formatter.match({
  "location": "productStep.user_select_the_universal_socket_option()"
});
formatter.result({
  "duration": 2211768109,
  "status": "passed"
});
formatter.match({
  "location": "productStep.user_select_power_rating()"
});
formatter.result({
  "duration": 7452471880,
  "status": "passed"
});
formatter.match({
  "location": "productStep.user_select_a_random_compatible_extra()"
});
formatter.result({
  "duration": 246502186,
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
  "duration": 5181094360,
  "status": "passed"
});
});