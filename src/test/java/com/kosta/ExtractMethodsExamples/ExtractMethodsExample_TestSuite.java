package com.kosta.ExtractMethodsExamples;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        ExtractMethodsExample_Before_Test.class,
        ExtractMethodsExample_After_NoLocalVariables_Test.class,
        ExtractMethodsExample_After_UsingLocalVariables_Test.class,
        ExtractMethodsExample_After_ReassigningLocalVariables_Test.class
})
public class ExtractMethodsExample_TestSuite {

}
