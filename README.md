Basically you need to translate all messages from file `i18n/EnglishMessages.scala`. Download this file, rename it to, for example, FrenchMessages.scala.

This file is valid Scala program so you need to follow several rules to keep it valid.

There are two kind of messages based on:
* variables (message is constant):
```scala
override val variable = "message-for-translation"
```
* functions (message depends on arguments):
```scala
override def func(arg1: Int, arg2: String) =
  "message-for-translation" + arg1 + arg2
```

You should not change neither `override val variable` nor `override def func(arg1: Int, arg2: String)`. Translate only messages (strings) in quotes like `"message-for-translation"`.

Several rules about strings:
* strings can be concatenated using character `+`: `"message one " + "message two" + " message three"`
* strings may depend on another variables in functions:
```scala
override def tooManySubscriptions(max: Int) =
  s"Too many active subscriptions. Only $max subscriptions per user is allowed."
```
This string depends on variable `max`. So in Telegram client user sees message `"Too many active subscriptions. Only 40 subscriptions per user is allowed."`. In order to bind value of variable `max` you should add letter `"s"` before string: `s"Too many...`. Optionally variable `max` may be surrounded by curly braces:

```scala
override def tooManySubscriptions(max: Int) =
  s"Too many active subscriptions. Only ${max} subscriptions per user is allowed."
```
* Multiline messages are specified by triple-quotes
```scala
override val helpText = """/add - Subscribes on all new tweets from Twitter, Instagram account or RSS feed
  |/addinstagram $account_name - Subscribes on all new photos from Instagram account
  |/addreddit $account_name - Subscribes on updates of SubReddit
  |/addrss $url - Subscribes on updates of RSS feed""".stripMargin
```
In this case user sees message:
```scala
  /add - Subscribes on all new tweets from Twitter, Instagram account or RSS feed
  /addinstagram $account_name - Subscribes on all new photos from Instagram account
  /addreddit $account_name - Subscribes on updates of SubReddit
  /addrss $url - Subscribes on updates of RSS feed
```  
