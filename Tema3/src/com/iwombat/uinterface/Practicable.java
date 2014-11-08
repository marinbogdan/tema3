package com.iwombat.uinterface;
import com.iwombat.exceptions.Exceptions;
public interface Practicable {
		public boolean hasGasoline() throws Exceptions;
		public boolean hasDiesel() throws Exceptions;
		public void startEngine() throws Exceptions;
		public void getFuel(int nr) throws Exceptions;
}
