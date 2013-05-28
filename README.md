[BIntegration]: https://www.dropbox.com/s/fvdozx39xaa3h92/BIntegration.jar
[here]:https://github.com/ValerioMedeiros/BIntegration/blob/master/doc/Instructions.md

BIntegration
============


Installation procedures
---------------------

* Requires: AtelierB `4.1`, ProB `1.3.6` and Java `1.7`
* B-Integration is compatible with Mac Os and Linux.

Steps:
1. Donwload this file [BIntegration].

2. Move the file `BIntegration.jar` to $AtelierBInstallationDirectory/AB/extensions (Mac Os) or $AtelierBInstallationDirectory/extensions (Linux).

3. In terminal, type:

    `java -jar BIntegration.jar --install`
    
4. Past the file path of binary probcli and press enter.


### How B Integration works

B Integration is a tool to systematize the verification of B expressions integrated with AtelierB using the different ways with ProB.
Basically, the B integration take a B proof obligation in  B syntax from AtelierB and submit to ProB evaluate. When the proof obligation is ''true'', it is admitted as a B rule only in its specific module, the rule is precompiled and applied in proof obligation.


### Evaluating one proof obligation with interactive prover of AtelierB:

1. Use the shortcut (`Command+D` or `CRTL+D`) to call the B Integration in AtelierB`s interactive prover with a current proof obligation.

2. Load the rule created, type in interactive prover terminal `pc` to precompile the rule created.

3. Apply the rule selecting the new rule in theory list and clicking in `mp(Tac(..))` 

* Parameters are explained in [here].


### Evaluating proof obligations from a module:

1. Use the shortcut (`Command+D` or `CRTL+D`) to call the B Integration with a current module selected.

2. Define the parameters to evaluate the proof obligations.

3. Wait and analyse the results in text area.

