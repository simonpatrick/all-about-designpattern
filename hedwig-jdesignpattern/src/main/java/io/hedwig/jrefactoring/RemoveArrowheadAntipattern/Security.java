/*
package io.hedwig.jrefactoring.RemoveArrowheadAntipattern;

import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion;

import java.security.Permission;
import java.util.List;

*
        *Created by patrick on 15/11/4.


public class Security {
    public java.security.Security securityChecker;

    public bool HasAccess(User user, Permission permission,
                          IEnumerable<Permission> exemptions) {
        bool hasPermission = false;
        if (user != null) {
            if (permission != null) {
                if (exemptions.Count() == 0) {
                    if (SecurityChecker.CheckPermission(user, permission) ||
                            exemptions.Contains(permission)) {
                        hasPermission = true;
                    }
                }
                return hasPermission;
            }


            if (user == null || permission == null)
                return false;
            if (exemptions.Contains(permission))
                return true;
            return SecurityChecker.CheckPermission(user, permission);
        }
*/
