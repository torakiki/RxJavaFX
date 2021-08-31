# RxJavaFX: JavaFX bindings for RxJava

This is a fork of the original repository of [RxJava](https://github.com/ReactiveX/RxJava).

It's a follow up on [this comment](https://github.com/ReactiveX/RxJavaFX/pull/94#issuecomment-908499509) and it's the minimal work needed to make it up and running using [RxJava](https://github.com/ReactiveX/RxJava) version 3.x. As per the comment, the library has been repackaged on a different domain and released to Maven Central.

This library is released for our needs and to be easily available to our products, you can use it but don't expect any active maintenance.

A PDF version of the guide written by the original author is available [here](src/docs/rxjavafx-guide.pdf) given the original link is now dead.

Read the free eBook [_Learning RxJava with JavaFX_](https://www.gitbook.com/book/thomasnield/rxjavafx-guide/details) to get started.

RxJavaFX is a lightweight library to convert JavaFX events into [RxJava](https://github.com/ReactiveX/RxJava) Observables/Flowables and vice versa. It also has a `Scheduler` to safely move emissions to the JavaFX Event Dispatch Thread. 

Maven:

```xml
<dependency>
    <groupId>black.pdf.rxjava3</groupId>
	 <artifactId>rxjavafx</artifactId>
    <version>3.x.y</version>
</dependency>
```
 
## LICENSE

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

<http://www.apache.org/licenses/LICENSE-2.0>

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
