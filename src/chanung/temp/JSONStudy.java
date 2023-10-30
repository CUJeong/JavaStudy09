package chanung.temp;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JSONStudy {

    public static void main(String[] args) {
        String response = "{ \"city\" : [\"서울\", \"광주\", \"대구\", \"대전\", \"부산\", \"울산\", \"인천\"], \"fields\": [{\"id\": \"자장면\"},{\"id\": \"냉면\"}, {\"id\": \"김밥\"}, {\"id\": \"칼국수\"}], \"records\": [{\"시도명\": \"서울\", \"자장면\": 7069, \"냉면\": 11308, \"김밥\": 3215, \"칼국수\": 8962}, {\"시도명\": \"광주\", \"자장면\": 6800, \"냉면\": 9400, \"김밥\": 3160, \"칼국수\": 8400}, {\"시도명\": \"대구\", \"자장면\": 6250, \"냉면\": 10417, \"김밥\": 2750, \"칼국수\": 6750}, { \"시도명\": \"대전\", \"자장면\": 6700, \"냉면\": 10400, \"김밥\": 3000, \"칼국수\": 7800}, {\"시도명\": \"부산\", \"자장면\": 6143, \"냉면\": 10857, \"김밥\": 2786, \"칼국수\": 6986}, { \"시도명\": \"울산\", \"자장면\": 6500, \"냉면\": 9900, \"김밥\": 3300, \"칼국수\": 8400}, {\"시도명\": \"인천\", \"자장면\": 6500, \"냉면\": 10667, \"김밥\": 3050, \"칼국수\": 8000}]}";

        System.out.println(response);

        JSONParser jsonParser = new JSONParser();

        JSONObject jsonObj = null;

        try {
            jsonObj = (JSONObject)jsonParser.parse(response);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

        System.out.println(jsonObj);

        JSONArray records = (JSONArray)jsonObj.get("records");

        System.out.println(records);

        long minPrice = (long)((JSONObject)records.get(0)).get("냉면");
        for(int i = 0; i < records.size(); i++){
            JSONObject city = (JSONObject)records.get(i);
            if(minPrice > (long)city.get("냉면")){
                minPrice = (long)city.get("냉면");
            }
        }

        System.out.println("냉면 최소값 : " + minPrice);

        for(int i = 0; i < records.size(); i++){
            JSONObject city = (JSONObject)records.get(i);
            if(minPrice == (long)city.get("냉면")){
                System.out.println("냉면이 제일 싼 도시: " + city.get("시도명"));
            }
        }

        // 자장면 평균 가격 구하기
        long totalPrice = 0;
        for(int i = 0; i < records.size(); i++){
            JSONObject city = (JSONObject)records.get(i);
            totalPrice += (long)city.get("자장면");
        }

        double avgPrice = totalPrice / records.size();
        System.out.println(avgPrice);




    }

}
