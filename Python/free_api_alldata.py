import requests

# all data fetch
def free_api_demo():
    url = "https://api.freeapi.app/api/v1/public/randomproducts"
    try:
        response = requests.get(url)

        if response.status_code == 200:
            data = response.json()
            return data["data"]["data"]
    except Exception as e:
        print(f"Data can not fetch..! status code: {response.status_code}")
        print(f"Response : {response.text}")


def main():
    try:

        products = free_api_demo()

        for product in products:
            print(f"Pid: {product['id']}")
            print(f"product_name: {product['title']}")
            print(f"price: ${product['price']}")
            print(f"discountPercentage: {product['discountPercentage']}")
            print(f"rating: {product['rating']}")
            print(f"brand: {product['brand']}")
            print('')


    except Exception as e:
        print(str(e))

if __name__ == "__main__":
    main()


def main():
    pass

if __name__ == "__main__":
    main()