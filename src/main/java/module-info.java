module rxjavafx {
	requires transitive io.reactivex.rxjava3;
	requires transitive javafx.base;
	requires transitive javafx.graphics;
	requires transitive javafx.controls;
	requires org.reactivestreams;

	exports io.reactivex.rxjavafx.observables;
	exports io.reactivex.rxjavafx.observers;
	exports io.reactivex.rxjavafx.schedulers;
	exports io.reactivex.rxjavafx.sources;
	exports io.reactivex.rxjavafx.subscriptions;
	exports io.reactivex.rxjavafx.transformers;	
}
