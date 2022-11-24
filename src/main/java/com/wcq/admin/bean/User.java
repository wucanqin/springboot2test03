package com.wcq.admin.bean;

import com.sun.xml.internal.ws.developer.Serialization;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class User implements Serializable {
    private static final long serialVersionUID = 1L;
    private String username;
    private String password;

}
