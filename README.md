ENERGETIC DEVELOPMENT

Your task is to design and code a simple simulation of the energetic industry, that can be used for testing its efficiency. There are three major categories of classes in this assignment:

•	Energy Plants – they produce Energy over time with use of resources:

	Coal Plant – producrs 7 units of Energy and consumes 100 units of coal per day
	Solar Plant – produces 2 units of Energy per day
	Nuclear Plant – produces 10 000 units of Energy and consumes 1 unit of uranium per day
	Fusion Plant – produces 20 000 units of Energy and consumes 1 unit of helium per day
	Annihilation Plant – produces 25 000 units of Energy and consumes 1 unit of antimatter per day

•	Mines – they produce resources over time:
	
	Coal Mine – produces 40 units of coal per day
	Uranium Mine – produces 100 units of uranium per day
	Moon Mine – produces 10 units of helium per day
	Hadron Collider – produces 1 unit of antimatter per week

•	Energy Consumers – they consume Energy over time:

	World – consumes 6 000 000 units of Energy per day
	Poland – consumes 40 000 units of Energy per day
	New York – consumes 10 000 units of Energy per day

Explanation about ‘units’:

	1 energy unit is 1 MWh
	1 coal unit is 1000 tons of coal
	1 uranium unit is 100kg of enriched uranium
	1 helium unit is 100 kg of helium-3
	1 antimatter unit is 1 gram of antimatter 

It is recommended to create a ResourcesStorage class, in the Singleton pattern, that will keep all the produced fuel and Energy. As for creating sets of mines and plants for simulations, implement the Factory pattern.

In your program, you configure the amount and types of Energy plants and resource supplies(for example: 1 nuclear plant, 10 coal plants, 100 coal mines, 1 uranium mine). Then, the program tests whether the efficiency of the given setting(is this setting sufficient enough to power New York? Etc) by running a simulation of a 30 days cycle.
