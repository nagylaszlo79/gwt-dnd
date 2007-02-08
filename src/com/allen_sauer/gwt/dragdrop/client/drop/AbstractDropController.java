/*
 * Copyright 2006 Fred Sauer
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.allen_sauer.gwt.dragdrop.client.drop;

import com.google.gwt.user.client.ui.Panel;
import com.google.gwt.user.client.ui.Widget;

import com.allen_sauer.gwt.dragdrop.client.DragContext;
import com.allen_sauer.gwt.dragdrop.client.DropControllerCollection;

/**
 * Base class for all drop controllers with basic functionality.
 */
public abstract class AbstractDropController implements DropController {

  private Panel dropTargetPanel;

  public AbstractDropController(Panel dropTargetPanel) {
    this.dropTargetPanel = dropTargetPanel;
    DropControllerCollection.singleton().add(this);
    dropTargetPanel.addStyleName(getDropTargetStyleName());
  }

  public void drop(Widget widget) {
    this.dropTargetPanel.removeStyleName("pre-drop");
  }

  public Panel getDropTargetPanel() {
    return this.dropTargetPanel;
  }

  public abstract String getDropTargetStyleName();

  public boolean onDrop(DragContext dragContext) {
    this.dropTargetPanel.removeStyleName("pre-drop");
    return true;
  }

  public void onEnter(DragContext dragContext) {
    this.dropTargetPanel.addStyleName("pre-drop");
  }

  public void onLeave(DragContext dragContext) {
    this.dropTargetPanel.removeStyleName("pre-drop");
  }

  public void onMove(DragContext dragContext) {
  }

}
