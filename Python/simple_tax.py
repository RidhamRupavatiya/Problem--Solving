def main():
    n = 300000

    if n < 10000:
        i = 0
    elif 10001 <= n <= 50000:
        i = n * 10 / 100
    elif 50001 <= n <= 100000:
        i = n * 20 / 100
    elif n > 100000:
        i = n * 30 / 100
    
    print(i)


if __name__ == "__main__":
    main()