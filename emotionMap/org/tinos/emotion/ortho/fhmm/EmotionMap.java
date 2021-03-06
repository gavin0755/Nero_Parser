package org.tinos.emotion.ortho.fhmm;
import java.io.IOException;
import java.util.Map;
public interface EmotionMap{
	void initMotivationMap() throws IOException;
	void initPositiveMap() throws IOException;
	void initNegativeMap() throws IOException;
	public Map<String, Object> getPositiveMap();
	public void setPositiveMap(Map<String, Object> positiveMap);
	public Map<String, Object> getNegativeMap();
	public void setNegativeMap(Map<String, Object> negativeMap);
	public Map<String, Object> getMotivationMap() ;
	public void setMotivationMap(Map<String, Object> motivationMap);
}