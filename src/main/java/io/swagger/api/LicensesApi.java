/**
 * NOTE: This class is auto generated by the swagger code generator program (2.4.18).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.Error;
import io.swagger.model.License;
import io.swagger.model.LicenseList;
import io.swagger.model.Wallet;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2021-02-20T21:59:16.206Z")

@Api(value = "licenses", description = "the licenses API")
@RequestMapping(value = "")
public interface LicensesApi {

    @ApiOperation(value = "", nickname = "issueLicense", notes = "Issue a new license.", response = License.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Issued license.", response = License.class),
        @ApiResponse(code = 200, message = "- 409.1002: no more active licenses allowed ", response = Error.class) })
    @RequestMapping(value = "/licenses",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<License> issueLicense(@ApiParam(value = "Amount of money to spend for a license. Empty array for get free license. Maximum 10 active licenses"  )  @Valid @RequestBody Wallet args);


    @ApiOperation(value = "", nickname = "listLicenses", notes = "Returns a list of issued licenses.", response = LicenseList.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "List of issued licenses.", response = LicenseList.class),
        @ApiResponse(code = 200, message = "General errors using same model as used by go-swagger for validation errors.", response = Error.class) })
    @RequestMapping(value = "/licenses",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.GET)
    ResponseEntity<LicenseList> listLicenses();

}
