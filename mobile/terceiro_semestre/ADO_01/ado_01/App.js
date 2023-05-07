import { createStackNavigator } from '@react-navigation/stack';
import { NavigationContainer } from '@react-navigation/native';
import Formulario from "./components/Formulario"
import Dados from "./components/Dados";

export default function App() {
  const Stack = createStackNavigator();

  const telas = {
    formulario: "FORMULARIO",
    dados: "DADOS",
  }

  return (
    <NavigationContainer>
    <Stack.Navigator
       initialRouteName={telas.formulario}
    >
      <Stack.Screen
        name={telas.formulario}
        component={Formulario}
        options={{
          headerShown: false,
        }}
      />
      <Stack.Screen
        name={telas.dados}
        component={Dados}
        options={{
          headerShown: false,
        }}
      />
    </Stack.Navigator>
    </NavigationContainer>
  );
}