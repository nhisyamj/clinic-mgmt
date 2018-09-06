package com.nhisyamj.clinic.api;

/**
 *<h1>ApiException</h1>
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
public class ApiException extends Exception{
    private int code;
    public ApiException (int code, String msg) {
        super(msg);
        this.code = code;
    }
}
