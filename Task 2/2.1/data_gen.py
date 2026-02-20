import pandas as pd
import numpy as np
import random
import string

fourDTuples = pd.DataFrame({
    "w": np.random.randint(0, 10000, size=6000),
    "x": np.random.randint(20000, 1000000, size=6000),
    "y": np.random.randint(0, 10, size=6000),
    "z": np.random.randint(0, 5, size=6000),
})

print("Gen Done")

fourDTuples.to_csv("tuples.csv", index=False, header=False)