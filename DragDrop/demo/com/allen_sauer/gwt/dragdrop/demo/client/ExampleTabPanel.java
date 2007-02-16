package com.allen_sauer.gwt.dragdrop.demo.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.Panel;
import com.google.gwt.user.client.ui.TabPanel;
import com.google.gwt.user.client.ui.VerticalPanel;

import com.allen_sauer.gwt.dragdrop.client.drop.DropController;

/**
 * TabPanel which uses a VeriticalPanel to provide a description for each
 * example.
 */
public class ExampleTabPanel extends TabPanel {

  private static final String STYLE_DEMO_EXAMPLE_DESCRIPTION = "demo-example-description";
  private static final String STYLE_DEMO_EXAMPLE_PANEL = "demo-example-panel";

  public static HTML describe(String controllerClassName, String description) {
    HTML html = new HTML("<code>" + controllerClassName + "</code><br>\n" + "<i>" + description + "</i>");
    html.addStyleName(STYLE_DEMO_EXAMPLE_DESCRIPTION);
    return html;
  }

  private int counter;

  public void add(Panel panel, DropController dropController, String description) {
    String controllerClassName = GWT.getTypeName(dropController);
    controllerClassName = controllerClassName.substring(controllerClassName.lastIndexOf('.') + 1);
    panel.addStyleName(STYLE_DEMO_EXAMPLE_PANEL);
    VerticalPanel verticalPanel = new VerticalPanel();
    verticalPanel.add(describe(controllerClassName, description));
    verticalPanel.add(panel);
    add(verticalPanel, "Example " + ++counter, true);
    // ensure added tab is visible so DOM position coordinates are possible
    selectTab(getWidgetCount() - 1);
  }
}