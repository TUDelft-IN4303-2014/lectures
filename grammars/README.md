# Summary

This lecture lays the theoretic foundations for declarative syntax formalisms and syntax-based language processors, which we will discuss later in the course. We introduce the notions of *formal languages*, *formal grammars*, and *syntax trees*, starting from Chomsky's work on formal grammars as generative devices.

We start with a *formal* model of *languages* and investigate *formal grammars* and their *derivation relations* as finite models of infinite productivity. We further discuss several classes of formal grammars and their corresponding classes of formal languages. In a second step, we introduce the *word problem*, analyse its decidability and complexity for different classes of formal languages, and discuss consequences of this analysis on language processing. We conclude the lecture with a discussion about *parse tree* construction, *abstract syntax trees*, and *ambiguities*.

# Slides

[![View slides on Slideshare](Grammars and Trees.jpg)](http://www.slideshare.net/guwac/declarative-syntax-definition-grammars-and-trees) 

# Further Reading

1. Noam Chomsky (1956). Three models for the description of language. IRE Transactions on Information Theory, 2(3).

2. Noam Chomsky (1957). Syntactic Structures. Mouton.

3. John E. Hopcroft, Rajeev Motwani, Jeffrey D. Ullman (2006). Introduction to Automata Theory, Languages, and Computation. Addison-Wesley.

4. Andrew W. Appel and Jens Palsberg (2002). Lexical Analysis. In *Modern Compiler Implementation in Java*, 2nd edition. Cambridge University Press.

  This chapter focusses mainly on the generation of *scanners*, while the lecture starts with a implementation-independent view on lexical syntax. Though, section *2.1 Lexical tokens* provides already useful explanations. We will revisit this chapter in our lecture on [scanner generation](../../part-4-components/lecture-13-scanning).
  
5. Andrew W. Appel and Jens Palsberg (2002). Parsing. In *Modern Compiler Implementation in Java*, 2nd edition. Cambridge University Press.

  This chapter focusses mainly on specific parsing techniques and the generation of parsers, while the lecture starts with an implementation-independent view on parsing. Though, section *3.1 Context-free grammars* provides useful explanations. We will revisit this chapter in our lectures on [LL parsing](../../part-4-components/lecture-14-LL-parsing) and [LR parsing](../../part-4-components/lecture-15-LR-parsing).

6. Andrew W. Appel and Jens Palsberg (2002). Abstract Syntax. In *Modern Compiler Implementation in Java*, 2nd edition. Cambridge University Press.

  This chapter focusses mainly on abstract syntax tree construction in semantic actions, while the lecture starts with an implementation-independent view on trees. Though, section *4.2 Abstract parse trees* provides some useful explanations.
