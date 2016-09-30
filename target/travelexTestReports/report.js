$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/features/travelex.feature");
formatter.feature({
  "line": 1,
  "name": "Travelex slider",
  "description": "\r\nAs a user\r\nI would like to view travelex home page in compressed screen\r\nSo that i could see information in slides",
  "id": "travelex-slider",
  "keyword": "Feature"
});
formatter.before({
  "duration": 13572664431,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "View third Slide",
  "description": "",
  "id": "travelex-slider;view-third-slide",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 7,
      "name": "@1"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "I am on home page",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "I resize my window to 550 px",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "swipe sliders to the third slide",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I should see slide title as \"Exchange rate updates\"",
  "keyword": "Then "
});
formatter.match({
  "location": "TravelexSteps.i_am_on_home_page()"
});
formatter.result({
  "duration": 276540859,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "550",
      "offset": 22
    }
  ],
  "location": "TravelexSteps.i_resize_my_window_to_px(int)"
});
formatter.result({
  "duration": 54602030,
  "status": "passed"
});
formatter.match({
  "location": "TravelexSteps.swipe_sliders_to_the_third_slide()"
});
formatter.result({
  "duration": 5478867469,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Exchange rate updates",
      "offset": 29
    }
  ],
  "location": "TravelexSteps.i_should_see_slide_title_as(String)"
});
formatter.result({
  "duration": 64842636,
  "status": "passed"
});
formatter.after({
  "duration": 1069813689,
  "status": "passed"
});
});