object Warning {
  def printMessage(user : String = "Tom", message : String = "Hello" , importance : Int = 100) : String = {
    "Message for " + user + "(importance " + importance + "):" + message
  }


}
