
class Model {
  def say = {}
}

class Collection [T <: Model] {
  def filter(): Collection[T] = {
    return new Collection[T];
  }
}

class ModelCollection extends Collection[Model] {
//  def completed(): ModelCollection = {
  def completed(): Collection[Model] = {
    filter();
  }
}