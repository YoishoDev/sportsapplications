package de.hirola.sportsapplications.util;

import java.util.ArrayList;
import java.util.List;

/**
 * Copyright 2021 by Michael Schmidt, Hirola Consulting
 * This software us licensed under the AGPL-3.0 or later.
 *
 * Mapping object for RunningPlan to import from JSON.
 *
 * @author Michael Schmidt (Hirola)
 * @since v.0.1
 */
public class RunningPlanTemplate {

    public String name; // name of the template, becomes the name of running plan
    public String remarks;
    public int orderNumber; // number for the order of the plans
    public boolean isTemplate;
    public final List<RunningPlanTemplateUnit> trainingUnits;

    /**
     * Default constructor for import from json.
     */
    public RunningPlanTemplate() {
        this.name = "";
        this.remarks = "";
        this.orderNumber = 0;
        this.isTemplate = false;
        this.trainingUnits = new ArrayList<>();
    }

    public RunningPlanTemplate(String name, String remarks, int orderNumber) {
        this.name = name;
        this.remarks = remarks;
        this.orderNumber = orderNumber;
        this.isTemplate = false;
        this.trainingUnits = new ArrayList<>();
    }

    public RunningPlanTemplate(String name, String remarks, int orderNumber, List<RunningPlanTemplateUnit> trainingUnits) {
        this.name = name;
        this.remarks = remarks;
        this.orderNumber = orderNumber;
        this.isTemplate = true;
        this.trainingUnits = trainingUnits;
    }

    public RunningPlanTemplate(String name, String remarks, int orderNumber, boolean isTemplate, List<RunningPlanTemplateUnit> trainingUnits) {
        this.name = name;
        this.remarks = remarks;
        this.orderNumber = orderNumber;
        this.isTemplate = isTemplate;
        this.trainingUnits = trainingUnits;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setTemplate(boolean template) {
        isTemplate = template;
    }

    public List<RunningPlanTemplateUnit> getTrainingUnits() {
        return trainingUnits;
    }
}