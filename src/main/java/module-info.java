module black.pdf.rxjavafx {
	requires transitive io.reactivex.rxjava3;
	requires transitive javafx.base;
	requires transitive javafx.graphics;
	requires transitive javafx.controls;
	requires org.reactivestreams;

	exports black.pdf.rxjavafx.observables;
	exports black.pdf.rxjavafx.observers;
	exports black.pdf.rxjavafx.schedulers;
	exports black.pdf.rxjavafx.sources;
	exports black.pdf.rxjavafx.subscriptions;
	exports black.pdf.rxjavafx.transformers;	
}
