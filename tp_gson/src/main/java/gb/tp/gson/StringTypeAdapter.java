package gb.tp.gson;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

import java.lang.reflect.Type;

/**
 *
 */
public class StringTypeAdapter implements JsonSerializer<String>, JsonDeserializer<String> {


    @Override
    public JsonElement serialize(String src, Type typeOfSrc, JsonSerializationContext context) {
        return null;
    }

    @Override
    public String deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        if(json == null){
            return null;
        } else {
            try {//直接解析
                if (json.isJsonArray()){
                    return json.getAsJsonArray().toString();
                }
                if (json.isJsonObject()){
                    return  json.getAsJsonObject().toString();
                }
               /* String result = json.getAsString();
                if ("null".equalsIgnoreCase(result)){
                    return  null;
                }*/
                return json.getAsString();
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }
    }
}
