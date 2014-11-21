# Summary

# Slides

# Further Reading

1. Andrew W. Appel and Jens Palsberg (2002). Liveness Analysis. In *Modern Compiler Implementation in Java*, 2nd edition. Cambridge University Press.

  This chapter motivates liveness analysis as a requirement for register allocation, introduces the terminology we also use in the lecture, and develops an efficent method to calculate liveness information in a backward analysis.

2. Andrew W. Appel and Jens Palsberg (2002). Dataflow Analysis. In *Modern Compiler Implementation in Java*, 2nd edition. Cambridge University Press.

  This chapter takes a more general approach to dataflow analysis. It introduces intermediate representations as the basis for such analyses and presents various analyses in terms of *generate* and *kill* effects. It finally discusses optimisations based on dataflow analyses such as common-subexpression elimination, constant propagation, copy propagation, and dead-code elimination.
  
3. Flemming Nielson, Hanne R. Nielson, and Chris Hankin (2005). Principles of Program Analysis, 2nd corrected edition. Springer.

  This book gives an overview of the four major approaches to program analysis: data flow analysis, constrained based analysis, abstract interpretation, and type and effect systems. The presentation demonstrates the extensive similarities between the approaches. It presents the mathematical foundations and develops a generic framework for data flow analyses.
