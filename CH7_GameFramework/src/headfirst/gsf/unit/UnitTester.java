package headfirst.gsf.unit;

public class UnitTester {
    public void testType(Unit unit, String type, String expectedOutputType) {
        unit.setType(type);
        String outputType = unit.getType();
        if(outputType.equals(expectedOutputType)){
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test failed!");
        }
    }

    public void testNonExistentProperty(Unit unit, String propertyName) {

        try {
            Object outputValue = unit.getProperty(propertyName);
        } catch (RuntimeException e ) {
            System.out.println("Test Passed");
            return;
        }

        System.out.println("Test Failed");
    }

    public void testAddUnit(Unit unit, UnitGroup unitGroup) {
        unitGroup.addUnit(unit);
        Unit outputUnit = unitGroup.getUnit(unit.getId());
        if (unit.getId() == outputUnit.getId()) {
            System.out.println("Testcase passed")
        } else {
            System.out.println("Testcase failed");
        }
    }
}
