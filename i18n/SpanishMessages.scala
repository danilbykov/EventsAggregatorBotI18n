package io.events.aggregator.telegram.i18n

import io.events.aggregator.telegram.BaseMessages

trait SpanishMessages extends AbstractMessages with BaseMessages {

  override val noActiveSubscriptions =
    "Sin suscripciones activas. Usa el comando <pre>/add</pre> para agregar suscripciones"

  override def successfullySubscribed(twitter: String, channel: Option[String]) =
    channel match {
      case Some(name) =>
        s"Te has suscripto al canal '${name}' $twitter!"
      case None =>
        s"Suscripto a $twitter con éxito!"
    }
  override def alreadySubscribed(twitter: String) = s"La cuenta $twitter ya está siendo monitoreada"
  override val unknownError = "Ocurrió un error desconocido"
  override def accountNotExist(twitter: String) = s"La cuenta $twitter no existe"
  override def tooManySubscriptions(max: Int) =
    s"Demasiadas suscripciones activas. Máximo $max suscripciones por usuario permitidas."

  override def successfullyUnsubscribed(twitter: String) = s"Desuscripto de $twitter!"
  override val notSubscribed = "No se encuentra esta suscripción!"

  override def chooseSource(channelName: Option[String]) =
    header(channelName) + "Elige una fuente:"
  override val chooseSubscriptionForRemoval = "Elige una suscripción para borrar:"
  override val noSubscriptions = "No hay suscripciones activas"

  override def greetMessage(username: String) =
    s"Hola $username! Se inició $botName. Usa el comando /add para suscribir a " +
    "Twitter, Reddit, YouTube o RSS."
  override val helpText = """/add - Suscribirse a todas las nuevas publicaciones de Twitter, Instagram o RSS feed
    |/addinstagram $account_name - Suscribirse a todas las nuevas fotos de una cuenta de Instagram
    |/addreddit $account_name - Susribirse a las actualizaciones de un SubReddit
    |/addrss $url - Subscribirse a las actualizaciones de un feed de RSS
    |/addtwitch $channel_name - Suscribirse a todos los videos de una cuenta de Twitch
    |/addtwitter $account_name - Suscribirse a todos los tweets nuevos de una cuenta de Twitter
    |/addyoutube $channel_name - Suscribirse a todos los videos nuevos de un canal de YouTube
    |/list - Muestra la lista de todas las suscripciones
    |/help - Muestra esta ayuda
    |/remove - Borra una suscripción
    |/settings - Permite configurar el bot para tu conversación:
    |  — Elegir idioma preferido
    |  — Elegir la plantilla preferida para las suscripciones
    |  — Configurar el bot para tus canales de Telegram
    |  — Configurar el filtro de palabras
    |  — Restringir el acceso del bot en un grupo
    |  — y más""".stripMargin
  override val addUsageText = """Argumentos no válidos. Uso: <pre>/add $URL</pre> donde $URL es la URL de Twitter o Instagram. Por ejemplo, use
    |<pre>/add https://twitter.com/cristiano</pre> para monitorear una cuenta de Twitter o
    |<pre>/add https://www.instagram.com/cristiano/</pre> para monitorear una cuenta de Instagram""".stripMargin
  override val enterTwitter = "Ingresa el usuario de Twitter o la URL"
  override val addTwitterUsageText = """Argumentos no válidos. Uso: <pre>/addtwitter $account_name</pre> Por ejemplo, debes usar alguno de los siguientes formatos:
    |<pre>/addtwitter cristiano</pre> o
    |<pre>/addtwitter https://twitter.com/cristiano</pre>""".stripMargin
  override val enterInstagram = "Ingresa el usuario de Instagram o la URL"
  override val addInstagramUsageText = """Argumentos no válidos. Uso: <pre>/addinstagram $account_name</pre> Por ejemplo, debes usar alguno de los siguientes formatos:
    |<pre>/addinstagram cristiano</pre> o
    |<pre>/addinstagram https://www.instagram.com/cristiano/</pre>""".stripMargin
  override val enterAtom = "Ingresa la URL del feed de RSS o la URL de la webpage que contiene RSS"
  override val addAtomUsageText = """Argumentos no válidos. Uso: <pre>/addrss $account_name</pre> Por ejemplo, debes usar el siguiente comando:
    |<pre>/addrss https://feedforall.com/sample.xml</pre>""".stripMargin
  override val enterReddit = "EL Bot puede monitorear publicaciones en un SubReddit también como publicaciones de usuarios de Reddit. Ingresa el nombre del Subreddit, el usuario de Reddit o la URL."
  override val addRedditUsageText = """Argumentos no válidos. Uso: <pre>/addreddit $subreddit</pre> Por ejemplo, debes usar los siguientes comandos:
    |<pre>/addreddit cristianoronaldo</pre> o
    |<pre>/addreddit https://www.reddit.com/r/cristianoronaldo/</pre> o
    |<pre>/addreddit https://www.reddit.com/user/jdegoes</pre>""".stripMargin
  override val enterYouTubeText = "Ingresa el texto para buscar canales de YouTube."
  override val addYouTubeUsageText = """Argumentos no válidos. Uso: <pre>/addyoutube search_query</pre> Por ejemplo, debes usar el siguiente comando:
    |<pre>/addyoutube Cristiano Ronaldo</pre>""".stripMargin
  override val noYouTubeChannels = "No se encontraron canales de YouTube con lo que buscas"
  override val chooseYouTubeChannels = "Se encontraron los siguientes canales. Elige el canal al que quieras suscribirte:"
  override val enterTwitchText = "Ingresa el canal de Twitch o la URL"
  override val enterTwitchUsageText = """Argumentos no válidos. Uso: <pre>/addtwitch $channel_name</pre> Por ejemplo, debes usar los siguientes comandos:
    |<pre>/addtwitch GSL</pre> o
    |<pre>/addtwitch https://www.twitch.tv/gsl</pre>""".stripMargin

  override val noLink = "No se encontró ningún texto"
  override val backToBotSettingsButton = "<< Volver a la configuración"

  override def botSettings(channelName: Option[String]) =
    header(channelName) + "Configuración del Bot:"

  override val onlyForAdmins = "Solo los administradores puede ejecutar este comando"
  override val permissionsButton = "Permisos"
  override val restrictButton = "Restringir"
  override val disableRestrictionButton = "Deshabilitar restricciones"
  override val unrestrictedMode = "Todos los miembros de este grupo pueden agregar/borrar subscripciones. Haz click en el botón de abajo para " +
    "restringir estos comandos y requerir permisos de administrador."
  override val restrictedMode = "Solo los administradores pueden agregar/borrar suscripciones. Haz click en el botón de abajo para " +
    "brindar acceso a todos los miembros de este grupo."
  override val noPermissions = "Solo los administradores pueden ejecutar esta acción!"

  override val wordFilter = "Filtro de Palabras"
  override val editWordfilterButton = "Editar Filtros"
  override val removeWordfilterButton = "Quitar Filtros"
  override def noStopWords(channelName: Option[String]) =
    header(channelName) +
      "El Filtro de Palabras no está configurado. Use el Filtro de Palabras " +
      "para filtrar publicaciones que contienen por lo menos una palabra del Filtro de Palabras."
  override def stopWords(stopWords: Set[String], channelName: Option[String]) =
    header(channelName) +
      "El Filtro de Palabras se usa para filtrar publicaciones que contengan al menos " +
      s"una palabra del Filtro de Palabras.\n <b>Wordfilter: </b> ${stopWords.mkString(", ")}."
  override val enterStopWords =
    "Por favor, ingresa una lista de de palabras separadas por espacios. No más de 250 caracteres."
  override val tooLongStopList = "Tu mensaje excede los 250 caracteres. No mas de 250 caracteres."

  override val templatesButton = "Plantillas"
  override val backToTemplatesButton = "<< Volver a las Plantillas"
  override val activeButton = "Activo"
  override val activateButton = "Activar"
  override val sendExampleButton = "Enviar Ejemplo"
  override val sendImageButton = "Enviar Imagen"
  override val sendVideoButton = "Enviar Video"

  override def twitterTemplatesOverview(channelName: Option[String]) =
    header(channelName) + """Existen cuatro tipos de plantillas:
      |1. Enlace decorado con la vista preliminar oficial de Twitter. Se usa por defecto.
      |2. Link crudo con la vista previa oficial del Tweet. Los links crudos se ven "feo" pero el cliente de Telegram no solicita confirmación cuando haces click en el link. Por eso, este ahorra un click.
      |3. Si el Tweet es muy largo entonces el texto será truncado en la vista previa oficial. Esta plantilla siempre muestra el texto completo.
      |4. La misma plantilla que la tercera. Pero el link al Tweet está decorado con el texto 'Abrir Tweet'.""".stripMargin
  override def instagramTemplatesOverview(channelName: Option[String]) =
    header(channelName) + """Existen cuatro tipos de plantillas:
      |1. Enlace decorado con la vista preliminar oficial de Instagram. Se usa por defecto.
      |2. Link crudo con la vista previa oficial de Instagram. Los links crudos se ven "feo" pero el cliente de Telegram no solicita confirmación cuando haces click en el link. Por eso, este ahorra un click.
      |3. Si la publicación de Instagram es muy largo entonces el texto será truncado en la vista previa oficial. Esta plantilla siempre muestra el texto completo. Funciona bien para fotos simples, video, pero las publicaciones de Instagram con imágenes múltiples no está soportado. Solo se mostrará la primer imagen.
      |4. La misma plantilla que la tercera. Pero el link a la publicación de Instagram está decorado con el texto 'Abrir Instagram'.""".stripMargin
  override def redditTemplatesOverview(channelName: Option[String]) =
    header(channelName) + """Existen tres tipos de plantillas:
      |1. Enlace decorado con la vista preliminar oficial de Reddit. Se usa por defecto.
      |2. Link crudo con la vista previa oficial de Reddit. Los links crudos se ven "feo" pero el cliente de Telegram no solicita confirmación cuando haces click en el link. Por eso, este ahorra un click.
      |3. Decorated link with Instant View button. Please note that Instant Views are not supported by some Telegram clients (for example, in browser) and Instant View doesn't work if post is restricted for 18+ community.""".stripMargin
  override def youtubeTemplatesOverview(channelName: Option[String]) =
    header(channelName) + """Existen dos tipos de plantillas:
      |1. Enlace decorado con la vista preliminar oficial de YouTube. Se usa por defecto.
      |2. Link crudo con la vista previa oficial de YouTube. Los links crudos se ven "feo" pero el cliente de Telegram no solicita confirmación cuando haces click en el link. Por eso, este ahorra un click..""".stripMargin

  override def retweetedByWithLink(url: String, author: String): String =
    s"""<a href="$url">Retweeteado</a> por <b>$author</b>"""
  override def retweetedBy(author: String): String =
    s"""Retweeteado por <b>$author</b>"""
  override val openTweet = "Abrir Tweet"
  override val slidesNote = "(*) Esta publicación contiene <b>multiple</b> fotos. Haz click en el link para revisar las otras."
  override val openInInstagram = "Abrir en Instagram"
  override val openInReddit = "Abrir en Reddit"
  override val commentInSubreddit = "Comentario en Subreddit"
  override def videoScheduledOnYouTube(author: String, url: String) =
    s"""El Usuario <b>$author</b> programó un <a href="$url">nuevo video</a>"""
  override val readMore = "Leer más..."
  override def twitchVideo(user: String, url: String, directUrl: String) =
    s"""<b>$user</b> (Twitch Video)
      |Link al video: $url
      |Link directo al video: $directUrl""".stripMargin
  override def twitchStream(user: String, url: String, directUrl: String, chatUrl: String) =
    s"""<b>$user</b> (Twitch Stream)
      |Link al stream: $url
      |Link directo al stream: $directUrl
      |Link al chat: $chatUrl""".stripMargin

  override val forwardRetweetsButton = "Reenviar Retweets?"
  override val forwardRetweetsButton2 = "Reenviar Retweets"
  override val omitRetweetsButton = "Omitir Retweets"
  override def forwardRetweetsStateOverview(onlyTweets: Boolean, channelName: Option[String]) =
    if (onlyTweets) {
      header(channelName) +
        "Todos los Retweets están filtrados. Solamente los Tweets serán reenviados en Telegram. Haz click en el botón de abajo para enviar todas " +
        "las publicaciones de Twitter incluyendo Tweets y Retweets. Esta configuración no afecta otros servicios: " +
        "Instagram, Reddit, YouTube y demás."
    } else {
      header(channelName) +
        "Todas las publicaciones de Twitter (incluyendo Tweets y Retweets) serán reenviados en Telegram. Haz click en el botón de abajo " +
        "para filtrar los Retweets y enviar solo Tweets. Esta configuración no afecta otros servicios: " +
        "Instagram, Reddit, YouTube y demás."
    }

  override val receiveNewFeatureButton = "Recibir Notificaciones de Nuevas Mejoras?"
  override val turnOnNewFeatureButton = "Encender las Notificaciones de Nuevas Mejoras"
  override val turnOffNewFeatureButton = "Apagar las Notificaciones de Nuevas Mejoras"
  override def sendFeaturesNotifications(send: Boolean, channelName: Option[String]) =
    if (send) {
      header(channelName) + s"Las notificaciones sobre nuevas mejoras en $botName están activadas. Apaga estas notificaciones usando el botón de abajo."
    } else {
      header(channelName) + s"Las notificaciones sobre nuevas mejoras en $botName están desactivadas. Enciende estas notificaciones " +
      """usando el botón de abajo. Alternativamente puedes seguir esta <a href="https://twitter.com/EventsAggregat1">cuenta de Twitter</a>""" +
      " para estar al tanto de los nuevos agregados."
    }

  override val bindWithChannelButton = "Enlazar con Canal de Telegram"
  override val addNewChannelButton = "Agregar Nuevo Canal"
  override val unbindChannelButton = "Desunir canal"
  override val removeButton = "Remover"
  override val noChannelsBound = s"Sin canales unidos. Usa el botón de abajo para conectar $botName con tu canal."
  override val notBoundChannels = "Apreta el botón de abajo para enlazar un canal con este chat y así poder administrar las suscripciones para dicho canal"
  override def channelBound(channelName: String) =
    s"El canal <b>${channelName}</b> está enlazado con este chat. Puedes desunir el canal para usar el chat de manera regular " +
    "o enlazar con otro canal para actualizar las suscripciones."
  override val addingChannel = s"Ingresa el nombre de tu canal. Por favor, asegurate que $botName se ya sea un administrador " +
    "del canal y tu seas el creador del canal."
  override def channelNotFound(channelName: String) =
    s"No se encontró el canal '${channelName}'."
  override val notCreator = "Solo el creador del canal puede enlazar un canal con el chat."
  override val notAdmin = s"El bot $botName debe estar agregado en tu canal como administrador."
  override def channelExists(channelName: String) =
    s"El canal '${channelName}' ya se encuentra enlazado a este chat."
  override val channelDoesNotExist = "El canal no está definido"
  override def channelDefined(channelName: String) =
    s"El canal '${channelName}' fue agregado satisfactoriamente. Selecciona este canal en el menú para administrar las suscripciones."
  override val channelDoesNotAlreadyExist =
    "Este canal no existe. Actualiza la lista de canales."

  override val instagramBroken = "Instagram previene obtener información desde sus páginas. El monitoreo de cuentas de Instagram " +
    "está desactivado."

  override val resumeButton = "Restaurar"
  override val deleteButton = "Eliminar"
  override val inactiveUser = "Estuviste inactivo por mucho tiempo y todas tus suscripciones fueron pausadas. " +
    "Deseas restaurar estas suscripciones?"
  override val monitoringResumed = "El monitoreo de todas tus suscripciones ha sido restaurado!"
  override val monitoringCancelled = "Todas tus suscripciones fueron eliminadas."
  override def tooLongInactive(daysLeft: Int) =
    "Por favor confirma que todavía usas este bot. Puedes hacerlo ingresando cualquier comando " +
    s"(por ejemplo, /help o /list). De otra forma tus suscripciones serán pausada en $daysLeft días."
  override val monitoringPaused =
    "El monitoreo de tus suscripciones fue pausado porque estuviste inactivo durante un largo tiempo. Puedes " +
    "restaurar el monitoreo en cualquier momento usando el botón de 'Restaurar' o borrar las suscripciones usando " +
    "el botón de 'Eliminar'."

  override val language = "Idioma"
  override def chooseLanguage(channelName: Option[String]) =
    header(channelName) + "Elige el idioma:"
}

object SpanishMessages extends SpanishMessages
