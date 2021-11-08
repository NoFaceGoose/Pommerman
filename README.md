# How to **call** constructors of the agents
#### MillisecondPlayer 

(Decide the action on current millisecond % number of available actions)

In **Run.java**, add another **case** in **switch (agentType)** with following code:

```
p = new MillisecondPlayer(seed, playerID++);
playerStr[i - 4] = "Millisecond";
```

Then use the **index** of this **case** in **String[] args**.

In **Test.java**, use the following code:

```
players.add(new MillisecondPlayer(seed, playerID++));
```



#### SimpleVariantPlayer

(Replace the last step of random selection in SimplePlayer with OSLA method)

In **Run.java**, add another **case** in **switch (agentType)** with following code:

```
p = new SimpleVariantPlayer(seed, playerID++);
playerStr[i - 4] = "SimpleVariant";
```

Then use the **index** of this **case** in **String[] args**.

In **Test.java**, use the following code:

```
players.add(new SimpleVariantPlayer(seed, playerID++));
```



#### MCTSPBBRPlayer

(MCTS with progressive bias and biasing rollouts)

In **Run.java**, add another **case** in **switch (agentType)** with following code:

```
MCTSPBBRParams mctsPBBRParams = new MCTSPBBRParams();
mctsPBBRParams.stop_type = mctsPBBRParams.STOP_ITERATIONS;
mctsPBBRParams.num_iterations = 200;
mctsPBBRParams.rollout_depth = 12;
mctsPBBRParams.heuristic_method = mctsPBBRParams.CUSTOM_HEURISTIC;
p = new MCTSPBBRPlayer(seed, playerID++, mctsPBBRParams);
playerStr[i - 4] = "MCTSPBBR";
```

Then use the **index** of this **case** in **String[] args**.

In **Test.java**, use the following code:

```
MCTSPBBRParams mctsPBBRParams = new MCTSPBBRParams();
mctsPBBRParams.stop_type = mctsPBBRParams.STOP_ITERATIONS;
mctsPBBRParams.heuristic_method = mctsPBBRParams.CUSTOM_HEURISTIC;

players.add(new MCTSPBBRPlayer(seed, playerID++, mctsPBBRParams));
```
