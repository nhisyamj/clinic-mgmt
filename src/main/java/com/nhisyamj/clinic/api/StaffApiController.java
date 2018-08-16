package com.nhisyamj.clinic.api;

import com.nhisyamj.clinic.model.Staff;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;

/**
 *<h1>StaffApiController</h1>
 * Class description
 * <p>
 ***
 * @author: Hisyam Johan
 * @since: 16/08/2018
 * @version: 1.0
 * Time: 10:50 PM
 * Email: nhisyamj@gmail.com
 ***
 */
@Controller
public class StaffApiController implements StaffApi {

    private static final Logger log = LoggerFactory.getLogger(StaffApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public StaffApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Void> addStaff(@ApiParam(value = "staff details need to be added"  )  @Valid @RequestBody Staff body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<Staff>> getStaff() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<Staff>>(objectMapper.readValue("[ {  \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\",  \"roles\" : {    \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\",    \"roleId\" : 5,    \"name\" : \"name\",    \"updatedDate\" : \"2000-01-23T04:56:07.000+00:00\"  },  \"name\" : \"name\",  \"weight\" : 1,  \"updatedDate\" : \"2000-01-23T04:56:07.000+00:00\",  \"isActive\" : false,  \"staffId\" : 0,  \"age\" : 6,  \"height\" : 5}, {  \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\",  \"roles\" : {    \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\",    \"roleId\" : 5,    \"name\" : \"name\",    \"updatedDate\" : \"2000-01-23T04:56:07.000+00:00\"  },  \"name\" : \"name\",  \"weight\" : 1,  \"updatedDate\" : \"2000-01-23T04:56:07.000+00:00\",  \"isActive\" : false,  \"staffId\" : 0,  \"age\" : 6,  \"height\" : 5} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Staff>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        if (accept != null && accept.contains("application/xml")) {
            try {
                return new ResponseEntity<List<Staff>>(objectMapper.readValue("<null>  <staffId>123456789</staffId>  <name>aeiou</name>  <age>123</age>  <weight>123</weight>  <height>123</height>  <createdDate>2000-01-23T04:56:07.000Z</createdDate>  <updatedDate>2000-01-23T04:56:07.000Z</updatedDate>  <isActive>true</isActive></null>", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/xml", e);
                return new ResponseEntity<List<Staff>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Staff>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<Staff>> staffFindByTypeGet(@ApiParam(value = "") @Valid @RequestParam(value = "staffName", required = false) String staffName,@ApiParam(value = "") @Valid @RequestParam(value = "staffId", required = false) Long staffId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/xml")) {
            try {
                return new ResponseEntity<List<Staff>>(objectMapper.readValue("<null>  <staffId>123456789</staffId>  <name>aeiou</name>  <age>123</age>  <weight>123</weight>  <height>123</height>  <createdDate>2000-01-23T04:56:07.000Z</createdDate>  <updatedDate>2000-01-23T04:56:07.000Z</updatedDate>  <isActive>true</isActive></null>", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/xml", e);
                return new ResponseEntity<List<Staff>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<Staff>>(objectMapper.readValue("[ {  \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\",  \"roles\" : {    \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\",    \"roleId\" : 5,    \"name\" : \"name\",    \"updatedDate\" : \"2000-01-23T04:56:07.000+00:00\"  },  \"name\" : \"name\",  \"weight\" : 1,  \"updatedDate\" : \"2000-01-23T04:56:07.000+00:00\",  \"isActive\" : false,  \"staffId\" : 0,  \"age\" : 6,  \"height\" : 5}, {  \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\",  \"roles\" : {    \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\",    \"roleId\" : 5,    \"name\" : \"name\",    \"updatedDate\" : \"2000-01-23T04:56:07.000+00:00\"  },  \"name\" : \"name\",  \"weight\" : 1,  \"updatedDate\" : \"2000-01-23T04:56:07.000+00:00\",  \"isActive\" : false,  \"staffId\" : 0,  \"age\" : 6,  \"height\" : 5} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Staff>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Staff>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> updateStaff(@ApiParam(value = "staff details need to be updated"  )  @Valid @RequestBody Staff body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

}
