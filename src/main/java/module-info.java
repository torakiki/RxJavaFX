module org.pdfsam.rxjavafx {
	requires transitive io.reactivex.rxjava3;
	requires transitive javafx.base;
	requires transitive javafx.graphics;
	requires transitive javafx.controls;
	requires org.reactivestreams;

	exports org.pdfsam.rxjavafx.observables;
	exports org.pdfsam.rxjavafx.observers;
	exports org.pdfsam.rxjavafx.schedulers;
	exports org.pdfsam.rxjavafx.sources;
	exports org.pdfsam.rxjavafx.subscriptions;
	exports org.pdfsam.rxjavafx.transformers;	
}
