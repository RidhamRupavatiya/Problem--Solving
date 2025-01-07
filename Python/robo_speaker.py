import os

def main():
    print(".....you are talking with chitti...")

    while True:
        x = input("Enter what you want me to speak :")
        if x == 'q':
            os.system("say 'bye bye friens'")
        command = f"say {x}"
        os.system(command)



if __name__ == "__main__":
    main()