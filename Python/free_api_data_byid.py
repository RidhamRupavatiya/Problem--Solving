import requests

# data fetch by id
def free_api_demo_byid(id):
    url = f"https://api.freeapi.app/api/v1/public/randomproducts/{id}"

    response = requests.get(url)
    data = response.json()

    if data["success"] and "data" in data:
        return data["data"]

    else:
        raise Exception("Failed to fetch user Data")


def main():
    try:
        # pass id as an argument
        product_data = free_api_demo_byid(2)

        product_name = product_data["title"]
        price = product_data["price"]
        discPer = product_data["discountPercentage"]
        rating = product_data["rating"]
        brand = product_data["brand"]

        print(f"product_name: {product_name}")
        print(f"price: ${price}")
        print(f"discountPercentage: {discPer}")
        print(f"rating: {rating}")
        print(f"brand: {brand}")

    except Exception as e:
        print(str(e))

if __name__ == "__main__":
    main()