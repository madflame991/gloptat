/*
 * Copyright 2012 Adrian Toncean
 * 
 * This file is part of Global Optimization AT.
 *
 * Global Optimization AT is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Global Optimization AT is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Global Optimization AT. If not, see <http://www.gnu.org/licenses/>.
 */

package adrianton.gloptat.app;

import adrianton.gloptat.app.gui.ConfigGUI;
import adrianton.gloptat.app.gui.MainBenchGUI;
import adrianton.gloptat.app.gui.OutputGUI;
import adrianton.gloptat.objfun.MOF;

public class MainBench extends MainGeneric {
 
 void setupOF() {
  of = new MOF();
  of.setFunc(0);
 }
 
 public void changeOF(int id) {
  of.setFunc(id);
 }
 
 void start() {
  se = new MainBenchGUI(this);
 	
  con = new OutputGUI();
  
  setupOF();
  
  oaFactory = new OAFactory[2];
  conf = new ConfigGUI[2];
  
  tmpLoadFactories();
 }
    
 public static void main(String[] args) {
  MainBench instance = new MainBench();
  instance.start();
 }
}