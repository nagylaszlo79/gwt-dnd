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
package com.allen_sauer.gwt.dragdrop.client;

import com.google.gwt.user.client.ui.Panel;
import com.google.gwt.user.client.ui.Widget;

/**
 * Event interface for drag-and-drop events.
 */
public interface DragAndDropListener {

  void onDragStart(Widget draggable);

  // TODO use event object instead so we can pass more info in the future
  void onDrop(Widget draggable, Panel dropTargetPanel);

  boolean onPreventDragStart(Widget draggable);

  boolean onPreventDrop(Widget draggable);

}