SELECT country.name
FROM coutry
JOIN city ON coutry.countryId=sity.coutryId
JOIN building ON city.cityId=building.cityId
HAVING COUNT(building.buildingId) = 0;
