import pandas as pd
import numpy as np
import random
import string
import subprocess

def main(K):
    fourDTuples = pd.DataFrame({
        "w": np.random.randint(0, 10000, size=K),
        "x": np.random.randint(20000, 1000000, size=K),
        "y": np.random.randint(0, 10, size=K),
        "z": np.random.randint(0, 5, size=K),
    })

    print("Gen Done")

    fourDTuples.to_csv("tuples_2.csv", index=False, header=False)

i = input("Input K: ")
main(int(i))
