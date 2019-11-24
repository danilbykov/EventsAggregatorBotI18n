package io.events.aggregator.telegram.i18n

/**
 * Created by @EliasJuunior
 */
object PortugueseMessages extends EnglishMessages {

  override val noActiveSubscriptions =
    "Nenhuma inscrição ativa. Use o comando <pre>/add</pre> para adicionar inscrições"

  override def successfullySubscribed(twitter: String, channel: Option[String]) =
    channel match {
      case Some(name) =>
        s"O canal '${name}' está inscrito no $twitter com sucesso!"
      case None =>
        s"Inscrição no $twitter! realizada com sucesso"
    }
  override def alreadySubscribed(twitter: String) = s"A conta $twitter já está sendo monitorada"
  override val unknownError = "Ocorreu um erro desconhecido"
  override def accountNotExist(twitter: String) = s"A conta $twitter não existe"
  override def tooManySubscriptions(max: Int) =
    s"Existem muitas inscrições ativas. Apenas $max inscrições por usuário, são permitidas."

  override def successfullyUnsubscribed(twitter: String) = s"Inscrição do $twitter! cancelada com sucesso"
  override val notSubscribed = "Não foi possível encontrar esta inscrição!"

  override def chooseSource(channelName: Option[String]) =
    header(channelName) + "Escolha a fonte:"
  override val chooseSubscriptionForRemoval = "Escolha a inscrição para remover:"
  override val noSubscriptions = "Nenhuma inscrição ativa"

  override def greetMessage(username: String) =
    s"Olá $username! $botName foi iniciado. Use o comando /add para inscrever-se nas fontes: " +
    "Twitter, Reddit, YouTube ou RSS."
  override val helpText = """/add - Inscreva-se em todos os novos tweets do Twitter, contas do Instagram ou RSS feed
    |/addinstagram $account_name - Inscreva-se em todas as novas fotos de contas do Instagram
    |/addreddit $account_name - Inscreva-se em atualizações do SubReddit
    |/addrss $url - Inscreva-se em atualizações de RSS feed's
    |/addtwitch $channel_name - Inscreva-se em todos os novos vídeos de contas Twitch
    |/addtwitter $account_name - Inscreva-se em todos os novos tweets de contas do Twitter
    |/addyoutube $channel_name - Inscreva-se em todos os novos vídeos de canais do YouTube
    |/list - Liste todas as inscrições
    |/help - Mostra esta ajuda
    |/remove - Remove uma inscrição
    |/settings - Personalize o bot para seu chat:
    |  — Escolha seu idioma preferido
    |  — Escolha o modelo preferido para as inscrições
    |  — Configure o bot para canais do Telegram
    |  — Configure o Filtro de Palavras
    |  — Restrinja o acesso do bot ao grupo 
    |  — Entre outras...""".stripMargin
  override val addUsageText = """Argumento inválido. Use: <pre>/add $URL</pre> onde $URL seja um endereço do Twitter ou endereço do Instagram. Por exemplo, use
    |<pre>/add https://twitter.com/cristiano</pre> para monitorar contas do Twitter ou
    |<pre>/add https://www.instagram.com/cristiano/</pre> para monitorar contas do Instagram""".stripMargin
  override val enterTwitter = "Insira uma conta do Twitter ou URL"
  override val addTwitterUsageText = """Argumentos inválidos. Use: <pre>/addtwitter $account_name</pre> Por exemplo, você pode usar um dos seguintes formatos:
    |<pre>/addtwitter cristiano</pre> ou
    |<pre>/addtwitter https://twitter.com/cristiano</pre>""".stripMargin
  override val enterInstagram = "Insira uma conta do Instagram ou URL"
  override val addInstagramUsageText = """Argumentos inválidos. Use: <pre>/addinstagram $account_name</pre> Por exemplo, você pode usar um dos seguintes formatos:
    |<pre>/addinstagram cristiano</pre> ou
    |<pre>/addinstagram https://www.instagram.com/cristiano/</pre>""".stripMargin
  override val enterAtom = "Insira uma URL para RSS feed ou um URL para páginas HTML com RSS"
  override val addAtomUsageText = """Argumentos inválidos. Use: <pre>/addrss $account_name</pre> Por exemplo, você pode usar o seguinte comando:
    |<pre>/addrss https://feedforall.com/sample.xml</pre>""".stripMargin
  override val enterReddit = "O bot pode monitorar posts no SubReddit, como também posts de usuários do Reddit. Insira um Subreddit, usuário do Reddit ou URL."
  override val addRedditUsageText = """Argumentos inválidos. Use: <pre>/addreddit $subreddit</pre> Por exemplo, você pode usar os seguintes comandos:
    |<pre>/addreddit cristianoronaldo</pre> ou
    |<pre>/addreddit https://www.reddit.com/r/cristianoronaldo/</pre> ou
    |<pre>/addreddit https://www.reddit.com/user/jdegoes</pre>""".stripMargin
  override val enterYouTubeText = "Digite para buscar canais do YouTube."
  override val addYouTubeUsageText = """Argumentos inválidos. Use: <pre>/addyoutube search_query</pre> Por exemplo, você pode usar o seguinte comando:
    |<pre>/addyoutube Cristiano Ronaldo</pre>""".stripMargin
  override val noYouTubeChannels = "Nenhum canal do YouTube foi encontrado!"
  override val chooseYouTubeChannels = "Os seguintes canais foram encontrados. Por favor, escolha o canal para inscrever-se:"
  override val enterTwitchText = "Insira um nome de canal da Twitch ou URL"
  override val enterTwitchUsageText = """Argumentos inválidos. Use: <pre>/addtwitch $channel_name</pre> Por exemplo, você pode usar os seguintes comandos:
    |<pre>/addtwitch GSL</pre> ou
    |<pre>/addtwitch https://www.twitch.tv/gsl</pre>""".stripMargin

  override val noLink = "Nenhum texto encontrado"
  override val backToBotSettingsButton = "<< Retornar para as configurações do Bot"

  override def botSettings(channelName: Option[String]) =
    header(channelName) + "Configurações do Bot:"

  override val onlyForAdmins = "Apenas administradores tem permissão para este comando"
  override val permissionsButton = "Permissões"
  override val restrictButton = "Restrito"
  override val disableRestrictionButton = "Desabilitar restrições"
  override val unrestrictedMode = "Todos os membros deste grupo podem adicionar/remover inscrições. Clique no botão abaixo para " +
    "restringir estes comandos e exigir permissões de administrador."
  override val restrictedMode = "Apenas administradores podem adicionar/remover inscrições. Clique no botão abaixo para " +
    "conceder acesso à todos os membros deste grupo."
  override val noPermissions = "Apenas administradores podem executar esta ação!"

  override val wordFilter = "Filtro de Palavras"
  override val editWordfilterButton = "Editar Filtro de Palavras"
  override val removeWordfilterButton = "Remover Filtro de Palavras"
  override def noStopWords(channelName: Option[String]) =
    header(channelName) +
      "Filtro de palavras não está configurado. Use o Filtro de palavras para filtrar postagem que tenha pelo menos " +
      "uma palavra do Filtro de Palavras."
  override def stopWords(stopWords: Set[String], channelName: Option[String]) =
    header(channelName) +
      "O Filtro de Palavras está sendo utilizado para filtrar postagens que contenham " +
      s"uma palavra do Filtro de Palavras.\n <b>Filtro de Palavras: </b> ${stopWords.mkString(", ")}."
  override val enterStopWords =
    "Por favor, digite a lista de palavras separadas por espaço. Não é permitido mais que 250 caracteres."
  override val tooLongStopList = "Sua mensagem excede os 250 caracteres. Não é permitido mais que 250 caracteres."

  override val templatesButton = "Modelos"
  override val backToTemplatesButton = "<< Retornar para Modelos"
  override val activeButton = "Ativo"
  override val activateButton = "Ativar"
  override val sendExampleButton = "Enviar um exemplo"
  override val sendImageButton = "Enviar imagem"
  override val sendVideoButton = "Enviar vídeo"

  override def twitterTemplatesOverview(channelName: Option[String]) =
    header(channelName) + """Existem quatro modelos disponíveis:
      |1. Link decorado com pré-visualização oficial do Tweet. Isto é usado por padrão.
      |2. Link bruto com pré-visualização oficial do Tweet. Os links brutos parecem "feios", mas o Telegram não pede confirmação quando você clica. Então isto economiza um clique.
      |3. Se o Tweet for muito longo, ele pode ser cortado na pré-visualização oficial. Este modelo sempre mostra o texto completo.
      |4. O mesmo que o terceiro modelo. Mas o link para a fonte é decorado como 'Abrir Tweet'.""".stripMargin
  override def instagramTemplatesOverview(channelName: Option[String]) =
    header(channelName) + """Existem quatro modelos disponíveis:
      |1. Link decorado com pré-visualização oficial do Instagram. Isto é usado por padrão.
      |2. Link bruto com pré-visualização oficial do Instagram. Os links brutos parecem "feios", mas o Telegram não pede confirmação quando você clica. Então isto economiza um clique.
      |3. Se a postagem do Instagram for muito longa, o texto pode ser cortado na pré-visualização oficial. Este modelo sempre mostra o texto completo. Funciona bem para uma foto única, vídeo, mas postagens com múltiplas imagens não são suportadas. Apenas a primeira imagem será mostrada.
      |4. O mesmo que o terceiro modelo. Mas o link para a postagem do Instagram é mostrado como 'Abrir no Instagram'.""".stripMargin
  override def redditTemplatesOverview(channelName: Option[String]) =
    header(channelName) + """Existem três modelos disponíveis:
      |1. Link decorado com pré-visualização oficial do Reddit. Isto é usado por padrão.
      |2. Link bruto com pré-visualização oficial do Reddit. Os links brutos parecem "feios", mas o Telegram não pede confirmação quando você clica. Então isto economiza um clique.
      |3. Link decorado com botão de Visualização Instantânea. Observe que a Visualização Instantânea não é suportada por alguns clientes do Telegram (por exemplo, no navegador) e também não funciona se a postagem for restrito para 18+.""".stripMargin
  override def rssTemplatesOverview(channelName: Option[String]) =
    header(channelName) + """There are three available templates:
      |1. Message consists of Feed Title, Post Title and Post Description."
      |2. Message consists of Feed Title and Post Title.
      |3. Message consists of only Post Title""".stripMargin
  override def youtubeTemplatesOverview(channelName: Option[String]) =
    header(channelName) + """Existem dois modelos disponíveis:
      |1. Link decorado com pré-visualização oficial do YouTube. Isto é usado por padrão.
      |2. Link bruto com pré-visualização oficial do Youtube. Os links brutos parecem "feios", mas o Telegram não pede confirmação quando você clica. Então isto economiza um clique.
      |3. Messages consists of Post Title and decorated link with official YouTube post preview.
      |4. Messages consists of Post Title, Post Description and decorated link with official YouTube post preview.""".stripMargin

  override def retweetedByWithLink(url: String, author: String): String =
    s"""<a href="$url">Retweetado</a> por <b>$author</b>"""
  override def retweetedBy(author: String): String =
    s"""Retweetado por <b>$author</b>"""
  override val openTweet = "Abrir Tweet"
  override val slidesNote = "(*) Esse post possui <b>múltiplas</b> fotos. Clique no link para ver as outras."
  override val openInInstagram = "Abrir no Instagram"
  override val openInReddit = "Abrir no Reddit"
  override val commentInSubreddit = "Comentar no Subreddit"
  override def videoScheduledOnYouTube(author: String, url: String) =
    s"""Usuário <b>$author</b> agendou um <a href="$url">novo video</a>"""
  override val readMore = "Ler mais..."
  override def twitchVideo(user: String, url: String, directUrl: String) =
    s"""<b>$user</b> (Twitch Video)
      |Link para video: $url
      |Link direto para o video: $directUrl""".stripMargin
  override def twitchStream(user: String, url: String, directUrl: String, chatUrl: String) =
    s"""<b>$user</b> (Twitch Stream)
      |Link para stream: $url
      |Link direto para stream: $directUrl
      |Link para chat: $chatUrl""".stripMargin

  override val forwardRetweetsButton = "Encaminhar Retweets?"
  override val forwardRetweetsButton2 = "Encaminhar Retweets"
  override val omitRetweetsButton = "Omitir Retweets"
  override def forwardRetweetsStateOverview(onlyTweets: Boolean, channelName: Option[String]) =
    if (onlyTweets) {
      header(channelName) +
        "Todos os Retweets estão filtrados. Apenas Tweets serão encaminhados no Telegram. Clique no botão abaixo para enviar todas as " +
        "postagens do Twitter incluíndo Tweets and Retweets. Essa configuração não afeta os outros serviços: " +
        "Instagram, Reddit, YouTube, etc."
    } else {
      header(channelName) +
        "Todas as postagens do Twitter (incluindo Tweets e Retweets) são encaminhados no Telegram. Clique no botão abaixo " +
        "para filtrar Retweets e enviar somente Tweets. Essa configuração não afeta os outros serviços: " +
        "Instagram, Reddit, YouTube, etc."
    }

  override val receiveNewFeatureButton = "Receber notificações de novas funcionalidades?"
  override val turnOnNewFeatureButton = "Ligar notificações para novas funcionalidades"
  override val turnOffNewFeatureButton = "Desligar notificações para novas funcionalidades"
  override def sendFeaturesNotifications(send: Boolean, channelName: Option[String]) =
    if (send) {
      header(channelName) + s"Notificações sobre novas funcionalidades do $botName estão ativas. Desligue-as no botão abaixo "
    } else {
      header(channelName) + s"Notificações sobre novas funcionalidades do $botName estão desativadas. Ligue-as " +
      """utilizando o botão abaixo. Como alternativa, você pode seguir essa <a href="https://twitter.com/EventsAggregat1">conta do Twitter</a>""" +
      " para verificar as últimas melhorias."
    }

  override val bindWithChannelButton = "Vincular com canal do Telegram"
  override val addNewChannelButton = "Adicionar novo canal"
  override val unbindChannelButton = "Desvincular canal"
  override val removeButton = "Remover"
  override val noChannelsBound = s"Nenhum canal vinculado. Use o botão abaixo para conectar o $botName com seu canal."
  override val notBoundChannels = "Clique no botão abaixo para vincular o canal com esta conversa e administrar as inscrições no canal"
  override def channelBound(channelName: String) =
    s"Canal <b>${channelName}</b> está vinculado com esta conversa. Você pode desvincular para utilizar a conversa em modo normal " +
    "ou vincular com outro canal para atualizar as inscrições."
  override val addingChannel = s"Digite o nome de seu canal. Por favor, verifique se o $botName está adicionado como" +
    "administrador e você seja o criador do canal."
  override def channelNotFound(channelName: String) =
    s"Canal '${channelName}' não encontrado."
  override val notCreator = "Apenas o criador pode vincular o canal com esta conversa."
  override val notAdmin = s"Bot $botName precisa ser adicionado em seu canal como administrador."
  override def channelExists(channelName: String) =
    s"Canal '${channelName}' já está vinculado com esta conversa."
  override val channelDoesNotExist = "Canal não está definido"
  override def channelDefined(channelName: String) =
    s"Canal '${channelName}' adicionado com sucesso. Selecione este canal no menu para administrar as inscrições."
  override val channelDoesNotAlreadyExist =
    "Este canal não existe ainda. Atualize a lista de canais."

  override val instagramBroken = "O Instagram impede a obtenção de dados de suas páginas. Monitoramento de Instagram " +
    "está desativado."

  override val resumeButton = "Retomar"
  override val deleteButton = "Excluir"
  override val inactiveUser = "Você ficou inativo por muito tempo e todas as suas inscrições estão pausadas. " +
    "Você gostaria de retomar essas inscrições?"
  override val monitoringResumed = "O monitoramento de todas suas inscrições foram retomadas!"
  override val monitoringCancelled = "Todas as suas inscrições foram excluídas."
  override def tooLongInactive(daysLeft: Int) =
    "Por favor, confirme que você ainda usa este bot. Você pode fazer isso enviando qualquer comando " +
    s"(por exemplo, /help ou /list). Caso não confirme, suas inscrições serão pausadas em $daysLeft dias."
  override val monitoringPaused =
    "O Monitoramento de suas inscrições foram pausadas porque você ficou muito tempo inativo. Você " +
    "pode retomar o monitoramento a qualquer momento utilizando o botao 'Retomar' ou exclua as inscrições utilizando o " +
    "botão 'Excluir'."

  override val language = "Idioma"
  override val chooseLanguageBtn =
    "Escolha o idioma"
  override def chooseLanguage(channelName: Option[String]) =
    header(channelName) + "Escolha o idioma:"
}
