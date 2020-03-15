Feature:Albums

@gorest
Scenario: GetAlbums
When I provide the request data
And I make a call to the albums API
Then I validate that 200 is the status code
And I validate the response

