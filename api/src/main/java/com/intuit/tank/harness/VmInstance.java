package com.intuit.tank.harness;

/*
 * #%L
 * Intuit Tank Api
 * %%
 * Copyright (C) 2011 - 2015 Intuit Inc.
 * %%
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * #L%
 */

public enum VmInstance {

    FIRST_TIER("c5.large", "cpus = 2, ecus = 8, users = 500, memory = 4.0G"),
    SECOND_TIER("c5.xlarge", "cpus = 4, ecus = 16, users = 2000, memory = 8.0G"),
    THIRD_TIER("c5.2xlarge", "cpus = 8, ecus = 31, users = 4000, memory = 16.0G"),
    FOURTH_TIER("c5.4xlarge", "cpus = 16, ecus = 61, users = 8000, memory = 32.0G"),
    FIFTH_TIER("c5.9xlarge", "cpus = 36, ecus = 139, users = 16000, memory = 72.0G");
    

    private String display;
    private String description;

    private VmInstance(String display, String description) {
        this.display = display;
        this.description = description;
    }

    /**
     * @return the display
     */
    public String getDisplay() {
        return display;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    public static VmInstance fromString(String vmInstance) {
        VmInstance ret = VmInstance.FIRST_TIER;
        try {
            ret = valueOf(vmInstance);
        } catch (Exception e) {
            // bad name return default
        }
        return ret;
    }

}
