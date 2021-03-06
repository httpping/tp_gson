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
public class FloatTypeAdapter implements JsonSerializer<Float>, JsonDeserializer<Float> {


    @Override
    public JsonElement serialize(Float src, Type typeOfSrc, JsonSerializationContext context) {
        return null;
    }

    @Override
    public Float deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        if(json == null){
            return 0f;
        } else {
            try {//直接解析
                if (json.getAsString().equals("") || json.getAsString().equals("null")) {//定义为int类型,如果后台返回""或者null,则返回0
                    return 0f;
                }
                return  Float.parseFloat(json.getAsString());
            } catch (Exception e) {
                return 0f;
            }
        }
    }
}
