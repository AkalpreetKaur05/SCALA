object apply_example extends App
{
  def apply(name:String,a:Double):String=
  {
     var res=name+'*'+a
     res
  }
  def unapply(name:String):Option[(String,String)]=
  {
    var name1=name.split('*')
    if(name1.length==2) {
      Some(name1(0),name1(1))

    }
    else
      {
        None
      }
  }
  //var f=apply_example("akal",math.random())
  var f = apply_example.apply("akal",math.random())
  f match
  {
    case apply_example(f) =>println(f)
    case _=>println("not valid")
  }

}
