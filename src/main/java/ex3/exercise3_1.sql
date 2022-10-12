SELECT COUNT(country.name)
FROM coutry
JOIN city ON coutry.countryId=sity.coutryID
WHERE city.population > 400;
