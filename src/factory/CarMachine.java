package factory;

public class CarMachine extends GigaFactory {

  @Override
  Tesla create(TeslaType teslaType) {
    switch (teslaType) {
      case MODEL3:
        return new Model3();
      case MODELX:
        return new ModelX();
      default:
        return null;
    }
  }
}
