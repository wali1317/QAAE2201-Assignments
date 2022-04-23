# API Assignment 1

### Q1. What is API? Give 3 real-life examples of usage of API.

Ans. API stands for Application Programming Interface. In the context of APIs, the word Application refers to any 
software with a distinct function. The interface can be considered a contract of service between two applications. This 
contract defines how the two communicate using requests and responses. Their API documentation contains information on 
how developers are to structure those requests and responses. 

API enables companies to open up their applications’ data and functionality to external third-party developers, business 
partners, and internal departments within their companies. This allows services and products to communicate and leverage 
each other’s data and functionality through a documented interface. Developers don't need to know how an API is 
implemented; they simply use the interface to communicate with other products and services. API use has surged over the 
past decade, to the degree that many of the most popular web applications today would not be possible without APIs.

Real Life examples of usage of API:

#### Going to a bank:
Think of yourself as a user and a bank teller as an API, while the bank is the system you interact with. When you want 
to take some money out of your account, you walk up to the teller(API) and say, “I’d like $1,000 from this account”. 
The teller (API) then goes to the back, tells the bank manager (the system), “Mr/Ms.X would like $1,000” the bank manager (the system) gives the teller (API) $1,000, who eventually
gives it to you. As you can see, the API is a messenger between your needs and the system.

#### Searching for hotels.
When you go onto a travel site, it may be linked to 10 other travel sites to find the best deal for you. When you input details like Atlanta, 2
nights, and 1 Room, you send this request to those 10 different travel sites. The API takes your request for that specific location, date
range, and room and pings the 10 sites that send back the deals they have found. You look through the 10 deals and pick the best one.
Again, the API is a messenger for your requests.

#### Finding a Facebook profile.
Stalking your ex? Hopefully not, but thanks to APIs, you can do it easily! If you type in “John Smith” on Facebook, the API informs
Facebook’s servers that you’re looking for John Smith. Facebook then sends you a list of all the profiles that match that name (with factors
like vicinity to you or mutual friends). Now you can find John Smith!

### Q2. What is API testing and name some types of API testing?

Ans. API testing is a software testing practice that tests the APIs directory - from their functionality, reliability, 
performance, to security. Part of integration testing, API testing effectively validates the logic of the build 
architecture within a short amount of time.

#### Types of API testing:

API Testing types can be classified in different ways. Below are some of the common types of API 
testing:

- Functional Testing: testing functions based on the code.
- User Interface Testing: testing how easy it is to use and access the application.
- Security Testing: to make sure of the application’s safety against threats.
- Load Testing: testing the ability to withstand heavy load.
- Runtime & Error Detection: to make sure it’s empty from errors.
- Validation Testing: verifying the final efficiency, behavior, and other functions.
- Fuzz Testing: to rule out any possible negative behaviors.

It can also include:

- Unit Testing: testing manually one endpoint by one call waiting for one response.
- Integration Testing: It’s the most common API testing type.
- End to End Testing: in order to verify the data influx through some API connections.
- Performance Testing: It became embedded in CI/CD recently thanks to ReadyAPI.

### Q3. What is the difference between REST and SOAP APIs?

Ans. 
- REST APIs: REST stands for Representational State Transfer. REST APIs are usually termed "RESTful APIs.” REST relies 
on a client/server approach that separates the front and back ends of the API and provides considerable flexibility in 
development and implementation. REST is "stateless," which means the API stores no data or status between requests. REST 
defines a set of functions like GET, PUT, POST, DELETE, etc. that clients can use to access server data. Clients and 
servers exchange data using HTTP.

- SOAP APIs: The simple object access protocol (SOAP) is a messaging standard defined by the World Wide Web Consortium 
and broadly used to create web APIs, usually with XML. SOAP supports various communication protocols found across the 
internet, such as HTTP, SMTP, and TCP. SOAP is also extensible and style-independent, which allows developers to write 
SOAP APIs in varied ways and easily add features and functionality. The SOAP approach defines how the SOAP message is 
processed, the features and modules included, the communication protocol(s) supported, and the construction of SOAP 
messages.

### Q4. What are common HTTP methods? Explain with examples.

Ans. The common HTTP methods are POST, GET, PUT, DELETE. Followings are the explanation with example:

- POST: A POST request is used to send data to the server, for example, customer information, file upload, etc. using 
HTML forms. 
 
  Example: HTTP POST http://www.appdomain.com/users
- GET: The GET method is used to retrieve information from the given server using a given URI. Requests using GET should 
only retrieve data and should have no other effect on the data.

  Example: HTTP GET http://www.appdomain.com/users
- PUT: Replaces all current representations of the target resource with the uploaded content.

  Example: HTTP PUT http://www.appdomain.com/users/123
- DELETE:  Removes all current representations of the target resource given by a URI.

  Example: HTTP DELETE http://www.appdomain.com/users/123

### Q5. What is the difference between POST AND put? Explain with an example.

Ans. POST means "create new" as in "Here is the input for creating a user, create it for me".
PUT means "insert, replace if already exists.

POSTing twice with the same data means create two identical users with different ids. PUTing twice with the same data 
creates the user the first and updates him to the same state the second time (no changes). Since you end up with the 
same state after a PUT no matter how many times you perform it, it is said to be "equally potent" every time - 
idempotent. This is useful for automatically retrying requests. No more 'are you sure you want to resend' when you push 
the back button on the browser.

A general advice is to use POST when you need the server to be in control of URL generation of your resources. Use PUT 
otherwise. Prefer PUT over POST.

### Q6.  Name 5 main categories of HTTP status codes? Explain 5 status codes from each category(You have to tell the status 
code and description of each status code with an example).

Ans: HTTP defines these standard status codes that can convey the results of a client’s request. The status codes are 
divided into five categories.

- 1xx: Informational – Communicates transfer protocol-level information.
- 2xx: Success – Indicates that the client’s request was accepted successfully.
- 3xx: Redirection – Indicates that the client must take some additional action to complete their request.
- 4xx: Client Error – This category of error status codes points the finger at clients.
- 5xx: Server Error – The server takes responsibility for these error status codes.

Description:

#### 1xx: Informational

100 Continue
The server has received the request headers and the client should proceed to send the request body (in the case of a 
request for which a body needs to be sent; for example, a POST request). Sending a large request body to a server after 
a request has been rejected for inappropriate headers would be inefficient. To have a server check the request's headers, 
a client must send Expect: 100-continue as a header in its initial request and receive a 100 Continue status code in 
response before sending the body. If the client receives an error code such as 403 (Forbidden) or 405 (Method Not 
Allowed) then it should not send the request's body. The response 417 Expectation Failed indicates that the request 
should be repeated without the Expect header as it indicates that the server does not support expectations (this is the 
case, for example, of HTTP/1.0 servers).

101 Switching Protocols
The requester has asked the server to switch protocols and the server has agreed to do so.

102 Processing (WebDAV; RFC 2518)
A WebDAV request may contain many sub-requests involving file operations, requiring a long time to complete the request. 
This code indicates that the server has received and is processing the request, but no response is available yet. This 
prevents the client from timing out and assuming the request was lost.

103 Early Hints (RFC 8297)
Used to return some response headers before final HTTP message.

#### 2xx: Success

200 OK

It indicates that the REST API successfully carried out whatever action the client requested and that no more specific 
code in the 2xx series is appropriate.

Unlike the 204 status code, a 200 response should include a response body. The information returned with the response is
dependent on the method used in the request, for example:
- GET an entity corresponding to the requested resource is sent in the response;
- HEAD the entity-header fields corresponding to the requested resource are sent in the response without any message-body;
- POST an entity describing or containing the result of the action;
- TRACE is an entity containing the request message received by the end server.

201 Created

A REST API responds with the 201 status code whenever a resource is created inside a collection. There may also be times
when a new resource is created as a result of some controller action, in which case 201 would also be an appropriate 
response.

The newly created resource can be referenced by the URI(s) returned in the entity of the response, with the most 
specific URI for the resource given by a Location header field.

The origin server MUST create the resource before returning the 201 status code. If the action cannot be carried out 
immediately, the server SHOULD respond with a 202 (Accepted) response instead.

202 Accepted

A 202 response is typically used for actions that take a long while to process. It indicates that the request has been 
accepted for processing, but the processing has not been completed. The request might or might not be eventually acted 
upon, or even maybe disallowed when processing occurs.

Its purpose is to allow a server to accept a request for some other process (perhaps a batch-oriented process that is 
only run once per day) without requiring that the user agent’s connection to the server persist until the process is 
completed.

The entity returned with this response SHOULD include an indication of the request’s current status and either a pointer 
to a status monitor (job queue location) or some estimate of when the user can expect the request to be fulfilled.

204 No Content

The 204 status code is usually sent out in response to a PUT, POST, or DELETE request when the REST API declines to send 
back any status message or representation in the response message’s body.

An API may also send 204 in conjunction with a GET request to indicate that the requested resource exists but has no 
state representation to include in the body.

If the client is a user agent, it SHOULD NOT change its document view from that which caused the request to be sent. 
This response is primarily intended to allow input for actions to take place without causing a change to the user 
agent’s active document view. However, any new or updated metainformation SHOULD be applied to the document currently in 
the user agent’s dynamic view.

The 204 response MUST NOT include a message-body and thus is always terminated by the first empty line after the header
fields.

#### 3xx: Redirection

301 Moved Permanently
The 301 status code indicates that the REST API’s resource model has been significantly redesigned, and a new permanent URI has been
assigned to the client’s requested resource. The REST API should specify the new URI in the response’s Location header, and all future requests
should be directed to the given URI.

You will hardly use this response code in your API as you can always use the API versioning for the new API while retaining the old one.

302 Found

The HTTP response status code 302 Found is a common way of performing URL redirection. An HTTP response with this status code will
additionally provide a URL in the Location header field. The user agent (e.g., a web browser) is invited by a response with this code to make a
second. Otherwise identical, request to the new URL specified in the location field.

Many web browsers implemented this code in a manner that violated this standard, changing the request type of the new request to GET,
regardless of the type employed in the original request (e.g., POST). RFC 1945 and RFC 2068 specify that the client is not allowed to change the
method on the redirected request. The status codes 303 and 307 have been added for servers that wish to make unambiguously clear which kind
of reaction is expected of the client.

303 See Other

A 303 response indicates that a controller resource has finished its work, but instead of sending a potentially unwanted response body, it sends
the client the URI of a response resource. The response can be the URI of the temporary status message or the URI to some already existing,
more permanent resource.

Generally speaking, the 303 status code allows a REST API to send a reference to a resource without forcing the client to download its state.
Instead, the client may send a GET request to the value of the Location header.

The 303 response MUST NOT be cached, but the response to the second (redirected) request might be cacheable.

304 Not Modified

This status code is similar to 204 (“No Content”) in that the response body must be empty. The critical distinction is that 204 is used when there is
nothing to send in the body, whereas 304 is used when the resource has not been modified since the version specified by the request headers If-
Modified-Since or If-None-Match.

In such a case, there is no need to retransmit the resource since the client still has a previously-downloaded copy.
Using this saves bandwidth and reprocessing on both the server and client, as only the header data must be sent and received in comparison to
the entirety of the page being re-processed by the server, then sent again using more bandwidth of the server and client.

307 Temporary Redirect

A 307 response indicates that the REST API is not going to process the client’s request. Instead, the client should resubmit the request to the
URI specified by the response message’s Location header. However, future requests should still use the original URI.
A REST API can use this status code to assign a temporary URI to the client’s requested resource. For example, a 307 response can be used to
shift a client request over to another host.

The temporary URI SHOULD be given by the Location field in the response. Unless the request method was HEAD, the entity of the response
SHOULD contain a short hypertext note with a hyperlink to the new URI(s). If the 307 status code is received in response to a request other than
GET or HEAD, the user agent MUST NOT automatically redirect the request unless it can be confirmed by the user since this might change the
conditions under which the request was issued.

#### 4xx: Client Error

400 Bad Request

400 is the generic client-side error status, used when no other 4xx error code is appropriate. Errors can be like malformed request syntax, invalid
request message parameters, deceptive request routing, etc.

The client SHOULD NOT repeat the request without modifications.

401 Unauthorized

A 401 error response indicates that the client tried to operate on a protected resource without providing the proper authorization. It may have
provided the wrong credentials or none at all. The response must include a WWW-Authenticate header field containing a challenge applicable to
the requested resource.

The client MAY repeat the request with a suitable Authorization header field. If the request already included Authorization credentials, then the
401 response indicates that authorization has been refused for those credentials. If the 401 response contains the same challenge as the prior
response, and the user agent has already attempted authentication at least once, then the user SHOULD be presented with the entity that was
given in the response since that entity might include relevant diagnostic information.

403 Forbidden

A 403 error response indicates that the client’s request is formed correctly, but the REST API refuses to honor it, i.e., the user does not have the
necessary permissions for the resource. A 403 response is not a case of insufficient client credentials; that would be 401 (“Unauthorized”).
Authentication will not help, and the request SHOULD NOT be repeated. Unlike a 401 Unauthorized response, authenticating will make no
difference.

404 Not Found

The 404 error status code indicates that the REST API can’t map the client’s URI to a resource but may be available in the future. Subsequent
requests by the client are permissible.

No indication is given of whether the condition is temporary or permanent. The 410 (Gone) status code SHOULD be used if the server knows,
through some internally configurable mechanism, that an old resource is permanently unavailable and has no forwarding address. This status
code is commonly used when the server does not wish to reveal exactly why the request has been refused, or when no other response is
applicable.

405 Method Not Allowed

The API responds with a 405 error to indicate that the client tried to use an HTTP method that the resource does not allow. For instance, a readonly
resource could support only GET and HEAD, while a controller resource might allow GET and POST, but not PUT or DELETE.
A 405 response must include the Allow header, which lists the HTTP methods that the resource supports. For example:
Allow: GET, POST

#### 5xx: Server Error

500 Internal Server Error

500 is the generic REST API error response. Most web frameworks automatically respond with this response status code whenever they execute
some request handler code that raises an exception.

A 500 error is never the client’s fault, and therefore, it is reasonable for the client to retry the same request that triggered this response and hope
to get a different response.

The API response is the generic error message given when an unexpected condition is encountered, and no more specific message is suitable.

501 Not Implemented

The server either does not recognize the request method, or it cannot fulfill the request. Usually, this implies future availability (e.g., a new feature
of a web-service API).

### Q7. What are the main components of HTTP requests and HTTP responses?

Ans. The main components of HTTP requests are:

- HTTP method
- Uniform Resource Identifier (URI)
- HTTP Version
- Request Headers
- Payload

The main components of HTTP responses are:

- Status/Response code
- HTTP version
- Response Header
- Response Body

### Q8. What are the main components of the HTTP request header and response header?

Main components of HTTP request header:

Contains metadata for the HTTP Request message as key-value pairs. For example, client ( or browser) type, format 
supported by client, format of message body, cache settings etc.

Main components of HTTP response header:

Includes information for the HTTP response message. For example, Content-type, Content-length, date, 
status and server type.

### Q9. What is the difference between authentication and authorization?

Ans. In simple terms, authentication is the process of verifying who a user is, while authorization is the process of 
verifying what they have access to.

Comparing these processes to a real-world example, when you go through security in an airport, you show your ID to 
authenticate your identity. Then, when you arrive at the gate, you present your boarding pass to the flight attendant, 
so they can authorize you to board your flight and allow access to the plane.

### Q10. Briefly explain common API Authentication Methods.

Ans. There are a variety of ways to authenticate API requests. Here are the three most common methods:

HTTP Basic Authentication.

The simplest way to handle authentication is through the use of HTTP, where the username and password are sent alongside 
every API call. You can use an HTTP header and encode the username and password. Note that does not mean . If you end 
up using HTTP Basic Authentication, use it through HTTPS so the connection between the parties is encrypted.

API Key Authentication.

This method creates unique keys for developers and passes them alongside every request. The API generates a secret key 
that is a long, difficult-to-guess string of numbers and letters—at least 30 characters long, although there’s no set 
standard length. It is typically passed alongside the API authorization header.

OAuth Authentication.

For HTTP services, you can give third-party developers access by using the OAuth 2.0 authorization framework. This 
framework can orchestrate approvals automatically between the API owner and the service, or you can also authorize 
developers to obtain access on their own.