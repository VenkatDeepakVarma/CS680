package edu.umb.cs680.hw13.observer;

//import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ObserverTest {
	DJIAQuoteObservable djiaQuoteObservable = new DJIAQuoteObservable();
	PieChartObserver pieChartObserver = new PieChartObserver();
	StockQuoteObservable stockQuoteObservable = new StockQuoteObservable();
	TableObserver tableObserver = new TableObserver();
	ThreeDObserver threeDObserver = new ThreeDObserver();
	
	@SuppressWarnings("deprecation")
	@Test
	void verify_dijaQuoteObservable() {
		djiaQuoteObservable.addObserver(pieChartObserver);
		djiaQuoteObservable.addObserver(tableObserver);
		djiaQuoteObservable.addObserver(threeDObserver);
        djiaQuoteObservable.changeQuote((float) 70.3);
		djiaQuoteObservable.changeQuote(38);
	}
	
	@SuppressWarnings("deprecation")
	@Test
	void verify_stockQuoteObservable() {
		stockQuoteObservable.addObserver(pieChartObserver);
		stockQuoteObservable.addObserver(tableObserver);
		stockQuoteObservable.addObserver(threeDObserver);
		stockQuoteObservable.changeQuote("Design", 101);
		stockQuoteObservable.changeQuote("programming", 234);
	}

}