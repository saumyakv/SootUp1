package org.example;

import sootup.callgraph.CallGraph;
import sootup.callgraph.CallGraphAlgorithm;
import sootup.callgraph.ClassHierarchyAnalysisAlgorithm;
import sootup.callgraph.RapidTypeAnalysisAlgorithm;
import sootup.core.inputlocation.AnalysisInputLocation;
import sootup.core.signatures.MethodSignature;
import sootup.core.typehierarchy.ViewTypeHierarchy;
import sootup.core.types.VoidType;
import sootup.java.bytecode.inputlocation.JavaClassPathAnalysisInputLocation;
import sootup.java.core.JavaIdentifierFactory;
import sootup.java.core.types.JavaClassType;
import sootup.java.core.views.JavaView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Rapid Type Analysis - FAMILY
// works

public class Main3 {

    public static void main(String[] args) {

       String cpString = "/Users/saumyavaliveti/IdeaProjects/callchain/target/classes";
        List<AnalysisInputLocation> inputLocations = new ArrayList<>();
       inputLocations.add(new JavaClassPathAnalysisInputLocation(cpString));
        JavaView view = new JavaView(inputLocations);


        // Create type hierarchy
        final ViewTypeHierarchy typeHierarchy = new ViewTypeHierarchy(view);


        JavaClassType classTypeAunt = view.getIdentifierFactory().getClassType("org.skv.Aunt");
        JavaClassType classTypeSister = view.getIdentifierFactory().getClassType("org.skv.Sister");
        MethodSignature entryMethodSignature =
                JavaIdentifierFactory.getInstance()
                        .getMethodSignature(
                                classTypeSister,
                                JavaIdentifierFactory.getInstance()
                                        .getMethodSubSignature("move",
                                                VoidType.getInstance(),
                                                Collections.singletonList(classTypeAunt)));

        //System.out.println(typeHierarchy.subclassesOf(classTypeAunt));
        CallGraphAlgorithm rta = new RapidTypeAnalysisAlgorithm(view);

        CallGraph cg = rta.initialize(Collections.singletonList(entryMethodSignature));

        cg.callsFrom(entryMethodSignature).stream()
                .forEach(tgt -> System.out.println(entryMethodSignature + " may call " + tgt));


      }

}